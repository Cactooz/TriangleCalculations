package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle triangle;

        System.out.println("Välj ett val:");
        System.out.println("1. Höjd och bredd");
        System.out.println("2. Tre sidors längd");

        byte answer = input.nextByte();

        if (answer == 1) {
            System.out.print("Triangelns höjd: ");
            float height = input.nextFloat();

            System.out.print("Triangelns bredd: ");
            float width = input.nextFloat();

            triangle = new Triangle(width, height);
        }
        else if (answer == 2) {
            float[] sides = new float[3];

            System.out.println("Triangelns sidor: ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Sida " + (i+1) + ": ");
                sides[i] = input.nextFloat();
            }
            triangle = new Triangle(sides);
        }

    }
}
