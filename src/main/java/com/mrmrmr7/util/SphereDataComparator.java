package com.mrmrmr7.util;

import java.util.Comparator;

import com.mrmrmr7.figures.SphereData;

public class SphereDataComparator implements Comparator<SphereData> {

	@Override
	public int compare(SphereData data1, SphereData data2) {
		double result = 1000 * (data1.getSphere().getRadius() - data2.getSphere().getRadius());
		return (int) result;
	}

}
