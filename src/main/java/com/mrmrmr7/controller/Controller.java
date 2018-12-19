package com.mrmrmr7.controller;

import com.mrmrmr7.controller.exceptions.CONTROLLERImpossibleToAddException;
import com.mrmrmr7.controller.exceptions.CONTROLLERNotValidSphereException;
import com.mrmrmr7.entity.Sphere;
import com.mrmrmr7.service.Service;
import com.mrmrmr7.service.exceptions.SERVICEImpossibleToAddException;

public class Controller {
	private final static Controller INSTANCE = new Controller();
	private final Service service = Service.getInstance();
	
	private Controller() { }
	
	public static Controller getInstance() {
		return INSTANCE;
	}
	
	public void pushSphere(Sphere sphere) throws CONTROLLERNotValidSphereException, CONTROLLERImpossibleToAddException {
		if (!isValidSphere(sphere)) {
			throw new CONTROLLERNotValidSphereException();
		}
		
		try {			
			service.pushSphere(sphere);
		} catch (SERVICEImpossibleToAddException e) {
			throw new CONTROLLERImpossibleToAddException();
		}
	}
	
	private boolean isValidSphere(Sphere sphere) {
		boolean res = true;
		if ((sphere == null) || (sphere.getRadius() < 0)) {
			res = false;
		} 
		return res;
	}

	public Sphere getSphereById(int ID) {
		Sphere sphere = null;
		try {
			sphere = new Sphere(service.getSphereById(ID));
		} catch (Exception e) {
			
		}
		return sphere;
	}
	
	public Sphere getSphereForChangeById(int ID) {
		Sphere sphere = null;
		try {
			sphere = service.getSphereById(ID);
		} catch (Exception e) {
			
		}
		return sphere;
	}
}
