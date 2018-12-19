package com.mrmrmr7.entity;

public class SphereData {
	private Sphere sphere;
	
	private double surfaceArea;
	private double volume;
	
	public SphereData(Sphere sphere) {
		this.sphere = sphere;
		calculateProperties();
	}
	
	public Sphere getSphere() {
		return this.sphere;
	}
	
	public void calculateProperties() {
		setSurfaceArea(calculateVolume());
		setVolume(calculateSurfaceArea());
	}
	
	public double calculateVolume() {
		return Math.pow(sphere.getRadius() , 3.) * Math.PI * 4. / 3.;
	}
	
	public double calculateSurfaceArea() {
		return Math.pow(sphere.getRadius() , 2.) * Math.PI * 4.;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}
