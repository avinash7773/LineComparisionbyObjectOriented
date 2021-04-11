package com.lc;

public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point(1,4);
		Point p2 = new Point(7,8);
		
		Point p3 =new Point(1, 4);
		Point p4 =new Point(7, 6);
		
		Line obj1 = new Line(p1, p2);
		Line obj2 = new Line(p3, p4);
		
		Double length1 = obj1.getLength();
		Double length2 = obj2.getLength();
		
		System.out.println("Length of line1="+length1);
		System.out.println("Length of line2="+length2);
		
		if(length1.equals(length2)) 
			System.out.println("Lengths are equal");
		else
			System.out.println("Length are not equal");
	}

}
