package com.mrmrmr7.entity;

public class SphereData {
	private Sphere sphere;
	
	private double surfaceArea;
	private double volume;
	
	public SphereData(Sphere sphere) {
		this.sphere = sphere;
	}
	
	public Sphere getSphere() {
		return this.sphere;
	}
	
	public void calculateProperties() {
		surfaceArea = 0;
		volume = 0;
	}
	
	private void calculateVolume() {
		
	}
	
	private void calculateSurfaceArea() {
		
	}
}
