package com.mrmrmr7.warehouse;

import com.mrmrmr7.figures.*;
import com.mrmrmr7.view_interacting.ViewDatabaseInfo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseTest {

    @Test
	void SystemTest() {
		ViewDatabaseInfo base = ViewDatabaseInfo.getInstance();
		Figure sphere = new Sphere(3,new Point(3,3,3));
		base.add(sphere);
		FigureData test1 = new FigureData(base.getData(0));
		SphereData sphereData = (SphereData)test1.getData();
        System.out.println(sphereData.getSphere().getRadius());
        assertEquals(4, sphereData.getSphere().getRadius() , 0.01);
	}


}
