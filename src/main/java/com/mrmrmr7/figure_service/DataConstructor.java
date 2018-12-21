package com.mrmrmr7.figure_service;

import com.mrmrmr7.figure_dao.figure_DAO;
import com.mrmrmr7.figure_dao.exceptions.*;
import com.mrmrmr7.figures.Figure;
import com.mrmrmr7.figures.FigureData;
import com.mrmrmr7.figure_service.exceptions.SERVICEImpossibleToAddException;
import com.mrmrmr7.figure_service.exceptions.SERVICENoSuchElementException;
import com.mrmrmr7.figures.actions.FigureDataAction;

public class DataConstructor {
	private final static DataConstructor INSTANCE = new DataConstructor();
	private final figure_DAO figureDao = figure_DAO.getInstance();
	
	private DataConstructor() { }
	
	public static DataConstructor getInstance() {
		return INSTANCE;
	}
	
	public void pushSphere(Figure figure) throws SERVICEImpossibleToAddException {
		FigureData figureData = new FigureData(figure);
		figureData.setData(FigureDataAction.calculate(figure));
		
		try {
			figureDao.pushToBase(figureData);
		} catch (DAOImpossibleToAddException e) {
			throw new SERVICEImpossibleToAddException();
		}
	}
	
	public FigureData getSphereDataById(final int ID) throws SERVICENoSuchElementException {
		FigureData sphereData;
		try {
			sphereData = figureDao.getFromBase(ID);
		} catch (DAONoSuchElementException e) {
			throw new SERVICENoSuchElementException();
		}
		return sphereData;
	}
	
	public void removeSphereById(final int ID) {
		try {
			figureDao.removeFromBase(ID);
		} catch (Exception e) {
			
		}
	}
}
