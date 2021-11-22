package com.company;

public class Triangle {
	//Get the circumference of the triangle
	public static float Circumference(float s1, float s2, float s3) {
		return s1 + s2 + s3;
	}
	
	//Get the area of a triangle that we only know the 3 sides of
	public static float AreaWithSides(float s1, float s2, float s3) {
		float sp = Semiperimeter(s1, s2, s3);
		
		double area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
		
		return (float) area;
	}
	
	//Get the area with height and width
	public static float Area(float h, float w) {
		return (h*w)/2;
	}
	
	//Get the median point of the triangle
	public static float Median(float middle, float a, float b) {
		double median = Math.sqrt((2*a*a)+(2*b*b)-(middle*middle));
		
		return (float) median/2;
	}
	
	//Get the semiperimeter of the triangle
	public static float Semiperimeter(float s1, float s2, float s3) {
		return Circumference(s1, s2, s3) / 2;
	}
	
	//Get the radius of the circle that is inside the triangle
	public static float CircleInTriangle(float s1, float s2, float s3) {
		float sp = Semiperimeter(s1, s2, s3);
		
		double circleRadius = Math.sqrt(((sp-s1)*(sp-s2)*(sp-s3))/sp);
		
		return (float) circleRadius;
	}
	
	//Get the radius of the circle that is inside the triangle
	public static float CircleOutsideTriangle(float s1, float s2, float s3) {
		float sp = Semiperimeter(s1, s2, s3);
		
		double denominator = Math.sqrt(((sp-s1)*(sp-s2)*(sp-s3))*sp);
		double circleRadius = (s1*s2*s3)/(4*denominator);
		
		return (float) circleRadius;
	}
	
	//Get the third side of the triangle using pythagoras formula
	public static float getThirdSide(float s1, float s2) {
		double s3 = Math.sqrt((s1*s1)+(s2*s2));
		
		return (float) s3;
	}
	
	//Get the bisector of the triangle corner
	public static float Bisector(float s1, float s2, float alpha) {
		double p = 2 * s1 * s2 * Math.cos (alpha / 2);
		double bisector = p / (s1 + s2);
		return (float) bisector;
	}
}
