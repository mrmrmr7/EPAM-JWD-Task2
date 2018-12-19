package com.mrmrmr7.view;

import com.mrmrmr7.controller.Controller;
import com.mrmrmr7.controller.exceptions.CONTROLLERImpossibleToAddException;
import com.mrmrmr7.controller.exceptions.CONTROLLERNotValidSphereException;
import com.mrmrmr7.entity.Sphere;

public class View {
	private final static View INSTANCE = new View();
	private final Controller controller = Controller.getInstance();
	
	private View() { }
	
	public static View getInstance() {
		return INSTANCE;
	}
	
	public void add(Sphere sphere) {
		try {
			controller.pushSphere(sphere);
		} catch (CONTROLLERNotValidSphereException | CONTROLLERImpossibleToAddException e) {
			
		}
	}
	
	public Sphere getById(final int ID) {
		Sphere sphere = null;
		try {
			sphere = controller.getSphereById(ID);
		} catch (Exception e) {
			sphere = null;
		}
		return sphere;
	}
}
