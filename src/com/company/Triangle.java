package com.company;

public class Triangle {
	private float width, height, side1, side2, side3, angle;
	private float[] sides;
	
	//Main method to calculate the different things for the triangles
	public void Calculate() {
		if (angle != 0.0f) {
			if (angle == 90) {
				side3 = getThirdSide(side1, side2);
			}
			System.out.println("Bisektris: " + Bisector(side1, side2, angle));
		}
		else if (width == 0.0f || height == 0.0f) {
			splitArray();
			System.out.println("Omkrets: " + Circumference(side1, side2, side3));
			System.out.println("Area: " + AreaWithSides(side1, side2, side3));
			System.out.println("Median 1: " + Median(side1, side2, side3));
			System.out.println("Median 2: " + Median(side2, side1, side3));
			System.out.println("Median 3: " + Median(side3, side2, side1));
			System.out.println("Circle in triangle radius: " + CircleInTriangle(side1, side2, side3));
		}
		else {
			System.out.println("Area: " + (width*height)/2);
		}
	}
	
	//Split the array with the 3 sides into variables that can be used in the other methods
	private void splitArray() {
		side1 = sides[0];
		side2 = sides[1];
		side3 = sides[2];
	}
	
	//Get the circumference of the triangle
	private float Circumference(float s1, float s2, float s3) {
		return s1 + s2 + s3;
	}
	
	//Get the area of a triangle that we only know the 3 sides of
	private float AreaWithSides(float s1, float s2, float s3) {
		float sp = Semiperimeter(s1, s2, s3);
		
		double area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
		
		return (float) area;
	}
	
	//Get the median point of the triangle
	private float Median(float middle, float a, float b) {
		double median = Math.sqrt((2*a*a)+(2*b*b)-(middle*middle));
		
		return (float) median/2;
	}
	
	private float Semiperimeter(float s1, float s2, float s3) {
		return Circumference(s1, s2, s3) / 2;
	}
	
	private float CircleInTriangle(float s1, float s2, float s3) {
		float sp = Semiperimeter(s1, s2, s3);
		
		double circleRadius = Math.sqrt(((sp-s1)*(sp-s2)*(sp-s3))/sp);
		
		return (float) circleRadius;
	}
	
	//Get the third side of the triangle using pythagoras formula
	private float getThirdSide(float s1, float s2) {
		double s3 = Math.sqrt((s1*s1)+(s2*s2));
		
		return (float) s3;
	}
	
	private float Bisector(float s1, float s2, float alpha) {
		double p = 2 * s1 * s2 * Math.cos (alpha / 2);
		double bisector = p / (s1 + s2);
		return (float) bisector;
	}
}
