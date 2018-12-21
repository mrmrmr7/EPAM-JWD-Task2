package com.mrmrmr7.warehouse;

import com.mrmrmr7.figures.FigureData;
import java.util.HashMap;
import java.util.Map;

import com.mrmrmr7.warehouse.exceptions.*;

public class FigureWarehouse {
	private final static FigureWarehouse INSTANCE = new FigureWarehouse();
	private Map<Integer, FigureData> base = new HashMap<>();
	
	private FigureWarehouse() { }
	
	public static FigureWarehouse getInstance() {
		return INSTANCE;
	}
	
	public FigureData getSphereById(int id) throws SQLNoSuchIdException {
		return base.get(id);
	}
	
	public void addSphereData(FigureData figureData) throws SQLSuchIdIsCreatedYetException {
		base.put(figureData.getFigure().getId(), figureData);
	}
	
	public void removeSphereById(final int ID) {
		base.remove(ID);
	}
}

//figure_DAO хранит объекты figure_DAO - наблюдатель
//использовать figure_DAO