package com.company;

public class Triangle {
	private float width, height;
	private float[] sides;
	
	public Triangle(float triangleWidth, float triangleHeight) {
		width = triangleWidth;
		height = triangleHeight;
	}
	public Triangle(float[] triangleSides) {
		sides = triangleSides;
	}
	
	public void Calculate() {
		if (width == 0.0f || height == 0.0f) {
			System.out.println("Omkrets: " + CircumferenceWithSides());
			System.out.println("Area: " + AreaWithSides());
		}
	}
	
	private float CircumferenceWithSides() {
		return sides[0]+sides[1]+sides[2];
	}
	
	private float AreaWithSides() {
		float sp = (sides[0]+sides[1]+sides[2])/2;
		
		double area = Math.sqrt(sp*(sp-sides[0])*(sp-sides[1])*(sp-sides[2]));
		
		return (float) area;
	}
	
	//Check if empty
	//width.isEmpty();
}
