package com.mrmrmr7.dao;

import com.mrmrmr7.dao.exceptions.DAOImpossibleToAddException;
import com.mrmrmr7.dao.exceptions.DAONoSuchElementException;
import com.mrmrmr7.warehouse.exceptions.SQLNoSuchIdException;
import com.mrmrmr7.entity.SphereData;
import com.mrmrmr7.warehouse.DataBase;

public class DAO {
	private final static DAO INSTANCE = new DAO();
	private final DataBase dataBase = DataBase.getInstance();
	
	private DAO() {	}
	
	public static DAO getInstance() {
		return INSTANCE;
	}
	
	public void pushToBase(SphereData sphereData) throws DAOImpossibleToAddException {
		try {
			dataBase.addSphereData(sphereData);
		} catch (Exception e) {
			throw new DAOImpossibleToAddException();
		}
	}
	
	public SphereData getFromBase(final int ID) throws DAONoSuchElementException {		
		SphereData sphere = null;
		try {
			sphere = dataBase.getSphereById(ID);			
		} catch (SQLNoSuchIdException e) {
			throw new DAONoSuchElementException();
		}
		return sphere;
	}
	
	public void removeFromBase(final int ID) {
		dataBase.removeSphereById(ID);
	}
}
