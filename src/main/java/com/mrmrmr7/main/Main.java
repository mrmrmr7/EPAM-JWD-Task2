package com.mrmrmr7.main;

import com.mrmrmr7.entity.Sphere;
import com.mrmrmr7.view.View;

public class Main {
	public static void main(String[] args) {
		Sphere test = new Sphere(3,3,3,3);
		
		View base = View.getInstance();
		
		base.add(test);
		base.change(0).setRadius(5);		
		
		System.out.println(test.getCenter().getX());
	}
}
