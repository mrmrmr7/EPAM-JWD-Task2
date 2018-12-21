package com.mrmrmr7.figures.actions;

import com.mrmrmr7.figures.Figure;
import com.mrmrmr7.figures.Point;
import com.mrmrmr7.figures.Sphere;

public class SphereAction {
	public void move(Figure figure, Point point) {
	    figure.setPoint(point);
	}

    public double volume(Figure figure) {
	    Sphere sphere = new Sphere((Sphere) figure);
        return 4. * Math.PI * Math.pow(sphere.getRadius(), 2);
    }

    public double area(Figure figure) {
	    Sphere sphere = new Sphere((Sphere) figure);
	    return 4. / 3. * Math.PI * Math.pow(sphere.getRadius(), 3);
    }
}
