package com.mrmrmr7.entity.actions;

import com.mrmrmr7.entity.Figure;

public class SphereAction implements Actions {

	@Override
	public void move(Figure figure, double x, double y, double z) {
		figure.setX(x);
		figure.setY(y);
	}

}
