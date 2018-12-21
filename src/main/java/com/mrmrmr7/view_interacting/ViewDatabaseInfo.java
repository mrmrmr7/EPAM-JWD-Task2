package com.mrmrmr7.view_interacting;

import com.mrmrmr7.figures.Figure;
import com.mrmrmr7.figures.FigureData;
import com.mrmrmr7.validator.Controller;
import com.mrmrmr7.figures.Sphere;

public class ViewDatabaseInfo {
	private final static ViewDatabaseInfo INSTANCE = new ViewDatabaseInfo();
	private final Controller controller = Controller.getInstance();
	private ViewDatabaseInfo() { }
	
	public static ViewDatabaseInfo getInstance() {
		return INSTANCE;
	}
	
	public void add(Figure sphere) {
		controller.pushSphere(sphere);
	}
	
	public Sphere get(final int ID) {
		Sphere sphere = new Sphere((Sphere)controller.getSphereById(ID));
		
		return sphere;
	}
	
	public Sphere update(final int ID) {
		return (Sphere) controller.getSphereForChangeById(ID);
	}
	
	public Sphere update(final Sphere sphere) {
		return update(sphere.getId());
	}

	public FigureData getData(final int ID) {
		FigureData data = null;

		data = (FigureData) controller.getSphereDataById(ID);
		
		return data;
	}
	
	public FigureData getData(final FigureData data) {
		return getData(data.getFigure().getId());
	}
}
