package com.mrmrmr7.figures;

public class Sphere extends Figure {
	private Point center;
	private double radius;
	
	public Sphere(double radius, Point point) {
        super(point);
        this.center = point;
		this.radius = radius;
	}

	public Sphere(Sphere sphere) {
	    this.id = sphere.getId();
	    this.center = sphere.getCenter();
	    this.radius = sphere.getRadius();
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

	public double volume() {
	    return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double area() {
	    return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
