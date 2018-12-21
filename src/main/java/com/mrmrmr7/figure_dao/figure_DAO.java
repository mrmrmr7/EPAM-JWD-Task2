package com.mrmrmr7.figure_dao;

import com.mrmrmr7.figure_dao.exceptions.DAOImpossibleToAddException;
import com.mrmrmr7.figure_dao.exceptions.DAONoSuchElementException;
import com.mrmrmr7.figures.FigureData;
import com.mrmrmr7.warehouse.exceptions.SQLNoSuchIdException;
import com.mrmrmr7.figures.SphereData;
import com.mrmrmr7.warehouse.FigureWarehouse;

public class figure_DAO {
	private final static figure_DAO INSTANCE = new figure_DAO();
	private final FigureWarehouse  warehouse = FigureWarehouse.getInstance();
	
	private figure_DAO() {	}
	
	public static figure_DAO getInstance() {
		return INSTANCE;
	}
	
	public void pushToBase(FigureData sphereData) throws DAOImpossibleToAddException {
		try {
			warehouse.addSphereData(sphereData);
		} catch (Exception e) {
			throw new DAOImpossibleToAddException();
		}
	}
	
	public FigureData getFromBase(final int ID) throws DAONoSuchElementException {
		FigureData sphere = null;
		try {
			sphere = warehouse.getSphereById(ID);
		} catch (SQLNoSuchIdException e) {
			throw new DAONoSuchElementException();
		}
		return sphere;
	}
	
	public void removeFromBase(final int ID) {
		warehouse.removeSphereById(ID);
	}
}
