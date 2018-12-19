package com.mrmrmr7.main;

import com.mrmrmr7.entity.Sphere;
import com.mrmrmr7.view.View;

public class Main {
	public static void main(String[] args) {
		Sphere test = new Sphere(3,3,3);
		Sphere testtest = new Sphere(4,4,-5);
		View start = View.getInstance();
		start.add(test);
		start.add(testtest);
		Sphere test1 = start.getById(0);
		System.out.println(test1.getRadius());
	}
}
