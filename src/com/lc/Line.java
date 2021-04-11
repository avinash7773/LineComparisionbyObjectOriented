package com.lc;

public class Line {
	Point p1;
	Point p2;
	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double getLength() {
		double length = Math.sqrt((p2.x - p1.y) * (p2.x - p1.y) + (p2.y - p1.y) * (p2.y - p1.y));
		return length;
	}
}
