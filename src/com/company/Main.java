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
			
			//Run the calculations for the height and width
			triangle.Calculate();
		}
		else if (answer == 2) {
			float[] sides = new float[3];
			
			System.out.println("Triangelns sidor: ");
			//Add all the sides into an array
			for (int i = 0; i < 3; i++) {
				System.out.print("Sida " + (i+1) + ": ");
				sides[i] = input.nextFloat();
			}
			
			//Run the calculations for a triangle with 3 sides
			triangle.Calculate();
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
			
			triangle.Calculate();
		}
		
	}
}
