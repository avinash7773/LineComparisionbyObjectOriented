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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		return true;
	}
}
