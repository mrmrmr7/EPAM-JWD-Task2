package com.mrmrmr7.entity;

public class Sphere extends Figure {
	private Point center;
	private double radius;	
	private final int id;
	private static int last_id = 0;
	
	public Sphere(Point point, double radius) {
		this.center = point;
		this.radius = radius;
		this.id = Sphere.last_id;
		Sphere.last_id++;
	}
	
	public Sphere(double radius, double x, double y, double z) {
		center = new Point(x,y,z);
		this.radius = radius;
		this.id = Sphere.last_id;
		Sphere.last_id++;
	}
	
	public Sphere(Sphere sphereById) {
		this.center = sphereById.getCenter();
		this.radius = sphereById.getRadius();
		this.id = Sphere.last_id;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point point) {
		this.center = point;
	}

	public int getId() {
		return id;
	}
}
