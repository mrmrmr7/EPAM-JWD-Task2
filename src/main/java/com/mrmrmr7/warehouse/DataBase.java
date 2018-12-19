package com.mrmrmr7.warehouse;

import java.util.HashMap;
import java.util.Map;

import com.mrmrmr7.entity.SphereData;
import com.mrmrmr7.warehouse.exceptions.*;

public class DataBase {
	private final static DataBase INSTANCE = new DataBase();
	private Map<Integer, SphereData> base = new HashMap<>();
	
	private DataBase() { }
	
	public static DataBase getInstance() {
		return INSTANCE;
	}
	
	public SphereData getSphereById(int id) throws SQLNoSuchIdException {
		return base.get(id);
	}
	
	public void addSphereData(SphereData sphereData) throws SQLSuchIdIsCreatedYetException {
		base.put(sphereData.getSphere().getId(), sphereData);
	}
	
	public void removeSphereById(final int ID) {
		base.remove(ID);
	}
}
