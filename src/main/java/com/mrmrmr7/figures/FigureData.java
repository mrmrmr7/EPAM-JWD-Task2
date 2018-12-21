package com.mrmrmr7.figures;

import com.mrmrmr7.figures.actions.FigureAction;

public class FigureData extends Data {
    private Figure figure;
    private Data data;
    public FigureData() {}

    public FigureData(Figure figure) {
        this.figure = figure;
    }

    public FigureData(FigureData figureData) {
        this.figure = figureData.getFigure();
        this.data = figureData.getData();
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

