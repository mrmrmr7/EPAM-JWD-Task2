package com.mrmrmr7.validator;

import com.mrmrmr7.figures.Figure;
import com.mrmrmr7.figures.FigureData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrmrmr7.figures.Sphere;
import com.mrmrmr7.figure_service.DataConstructor;
import com.mrmrmr7.figure_service.exceptions.*;

public class Controller {
	private final static Controller INSTANCE = new Controller();
	private final static DataConstructor DATA_CONSTRUCTOR = DataConstructor.getInstance();
 	private final static Logger LOGGER = LogManager.getLogger(Controller.class);
	
	private Controller() { }
	
	public static Controller getInstance() {
		return INSTANCE;
	}
	
	public void pushSphere(Figure sphere) {
		if (!isValidSphere(sphere)) {
			LOGGER.error("Error: not valid sphere expectedto push");
		}
		
		try {			
			DATA_CONSTRUCTOR.pushSphere(sphere);
		} catch (SERVICEImpossibleToAddException e) {
			LOGGER.error("Error: impossible to push figure in database");
		}
	}
	
	private boolean isValidSphere(Figure figure) {
		boolean res = true;

		Sphere sphere = (Sphere) figure;

		if ((sphere == null) || (sphere.getRadius() < 0)) {
			res = false;
		} 
		
		return res;
	}

	public Figure getSphereById(int ID) {
        Figure sphere = null;
		
		try {
			sphere = new Figure(DATA_CONSTRUCTOR.getSphereDataById(ID).getFigure());
		} catch (Exception e) {
			LOGGER.error("Error: no object with such id");
		}
		
		return sphere;
	}
	
	public Figure getSphereForChangeById(int ID) {
		Figure sphere = null;
		
		try {
			sphere = DATA_CONSTRUCTOR.getSphereDataById(ID).getFigure();
		} catch (Exception e) {
			LOGGER.error("Error: no object with such id");
		}
		
		return sphere;
	}

	public FigureData getSphereDataById(int ID) {
		FigureData res = null;
		
		if (ID < 0) {
			LOGGER.error("Error: impossible to get ");
		}
		
		try {
			res = DATA_CONSTRUCTOR.getSphereDataById(ID);
		} catch (SERVICENoSuchElementException e) {
			
		}
		
		return res;
	}
}
