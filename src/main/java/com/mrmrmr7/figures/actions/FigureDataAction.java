package com.mrmrmr7.figures.actions;

import com.mrmrmr7.figures.Data;
import com.mrmrmr7.figures.Figure;
import com.mrmrmr7.figures.FigureData;
import com.mrmrmr7.figures.Sphere;

public class FigureDataAction {
    public static Data calculate(Figure figure) {
        Data data = new Data();
        data.setVolume(volume(figure));
        data.setSphereArea(area(figure));
        return data;
    }

    public static double volume(Figure figure) {
        if(figure instanceof Sphere) {
            Sphere sphere = (Sphere) figure;
            return sphere.volume();
        } else {
            return 0;
        }
    }

    public static double area(Figure figure) {
        if(figure instanceof Sphere) {
            Sphere sphere = (Sphere) figure;
            return sphere.area();
        } else {
            return 0;
        }
    }
}
