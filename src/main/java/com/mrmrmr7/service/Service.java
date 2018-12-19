package com.mrmrmr7.service;

import com.mrmrmr7.dao.DAO;
import com.mrmrmr7.dao.exceptions.DAOImpossibleToAddException;
import com.mrmrmr7.dao.exceptions.DAONoSuchElementException;
import com.mrmrmr7.entity.Sphere;
import com.mrmrmr7.entity.SphereData;
import com.mrmrmr7.service.exceptions.SERVICEImpossibleToAddException;

public class Service {
	private final static Service INSTANCE = new Service();
	private final DAO dao = DAO.getInstance();
	
	private Service () { }
	
	public static Service getInstance() {
		return INSTANCE;
	}
	
	public void pushSphere(Sphere sphere) throws SERVICEImpossibleToAddException {
		SphereData sphereData = new SphereData(sphere);
		sphereData.calculateProperties();
		try {
			dao.pushToBase(sphereData);	
		} catch (DAOImpossibleToAddException e) {
			throw new SERVICEImpossibleToAddException();
		}
	}
	
	public Sphere getSphereById(final int ID) {
		SphereData sphereData;
		Sphere sphere = null;
		try {
			sphereData = dao.getFromBase(ID);
			sphere = sphereData.getSphere();
		} catch (DAONoSuchElementException e) {
			e.printStackTrace();
		}
		return sphere;
	}
	
	public void removeSphereById(final int ID) {
		try {
			dao.removeFromBase(ID);
		} catch (Exception e) {
			//TODO !!
		}
	}
}
