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
		}
	}
	
	private float CircumferenceWithSides() {
		return sides[0]+sides[1]+sides[2];
	}
	
	//Check if empty
	//width.isEmpty();
}
