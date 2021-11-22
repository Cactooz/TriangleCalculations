package com.company;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Välj ett val:");
		System.out.println("1. Höjd och bredd");
		System.out.println("2. Tre sidors längd");
		System.out.println("3. Två sidors längd och vinkeln emellan dem");
		
		//Get the input
		byte answer = input.nextByte();
		
		if (answer == 1) {
			//Get the height of the triangle
			System.out.print("Triangelns höjd: ");
			float height = input.nextFloat();
			
			//Get the width of the triangle
			System.out.print("Triangelns bredd: ");
			float width = input.nextFloat();
			
			//Get the area of the triangle
			System.out.println("Area: " + Triangle.Area(height, width));
		}
		else if (answer == 2) {
			float[] sides = new float[3];
			
			System.out.println("Triangelns sidor: ");
			//Add all the sides into an array
			for (int i = 0; i < 3; i++) {
				System.out.print("Sida " + (i+1) + ": ");
				sides[i] = input.nextFloat();
			}
			
			//Print all calculations
			System.out.println("Omkrets: " + Triangle.Circumference(sides[0], sides[1], sides[2]));
			System.out.println("Area: " + Triangle.AreaWithSides(sides[0], sides[1], sides[2]));
			System.out.println("Median 1: " + Triangle.Median(sides[0], sides[1], sides[2]));
			System.out.println("Median 2: " + Triangle.Median(sides[0], sides[1], sides[2]));
			System.out.println("Median 3: " + Triangle.Median(sides[0], sides[1], sides[2]));
			System.out.println("Circle in triangle radius: " + Triangle.CircleInTriangle(sides[0], sides[1], sides[2]));
		}
		else if (answer == 3) {
			//Get the first side of the triangle
			System.out.print("Sida 1: ");
			float side1 = input.nextFloat();
			
			//Get the second side of the triangle
			System.out.print("Sida 2: ");
			float side2 = input.nextFloat();
			
			//Get the angle between the two sides
			System.out.print("Vinkeln emellan sidorna: ");
			float angle = input.nextFloat();
			
			//Calculate more if the angle is 90 degrees
			if (angle == 90) {
				float side3 = Triangle.getThirdSide(side1, side2);
				
				//Print all calculations
				System.out.println("Omkrets: " + Triangle.Circumference(side1, side2, side3));
				System.out.println("Area: " + Triangle.AreaWithSides(side1, side2, side3));
				System.out.println("Median 1: " + Triangle.Median(side1, side2, side3));
				System.out.println("Median 2: " + Triangle.Median(side2, side1, side3));
				System.out.println("Median 3: " + Triangle.Median(side3, side2, side1));
				System.out.println("Circle in triangle radius: " + Triangle.CircleInTriangle(side1, side2, side3));
			}
			System.out.println("Bisektris: " + Triangle.Bisector(side1, side2, angle));
		}
		
	}
}
