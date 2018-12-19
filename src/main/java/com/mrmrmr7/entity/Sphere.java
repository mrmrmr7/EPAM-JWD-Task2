package com.mrmrmr7.entity;

public class Sphere {
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
	
	public Sphere(double x, double y, double radius) {
		this.center = new Point(x,y);
		this.radius = radius;
		this.id = Sphere.last_id;
		Sphere.last_id++;
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
