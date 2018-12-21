package com.mrmrmr7.figures;

public class Figure extends Data {
	private Point point;
	private Data data;
    private static int last_id = 0;
    protected int id;

	public Figure(Point point) {
	    this.id = Figure.last_id;
	    this.point = point;
	}

    public Figure() {
    }

    public Figure(Figure figure) {
	    this.point = figure.getPoint();
	    this.id = figure.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
