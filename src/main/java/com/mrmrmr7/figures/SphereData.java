package com.mrmrmr7.figures;

public class SphereData extends FigureData {
	private Sphere sphere;
	
	private double surfaceArea;
	private double volume;
	
	public SphereData(Sphere sphere) {
		this.sphere = sphere;
	}
	
	public SphereData(SphereData data) {
		this.sphere = data.sphere;
		this.surfaceArea = data.surfaceArea;
		this.volume = data.volume;
	}

	public Sphere getSphere() {
		return this.sphere;
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
