package com.lc;

public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point(1,4);
		Point p2 = new Point(7,8);
		
		Line length = new Line(p1, p2);
		
		System.out.println("Length of line="+length.getLength());
	}

}
