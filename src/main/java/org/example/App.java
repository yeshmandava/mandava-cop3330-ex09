package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */
public class App 
{
    public static void main( String[] args )
    {
        final int GallonConvert = 350;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of your room: ");
        double length = input.nextDouble();
        System.out.print("What is the width if your room: ");
        double width = input.nextDouble();

        double totalArea = length * width;
        int totalPaint = (int) Math.ceil(totalArea/GallonConvert);

        System.out.print("The dimensions of your room are " +length+ " feet by " +width+ " feet, for a total area of " +totalArea+ " square feet.");
        System.out.print("\nYou will need " +totalPaint+ " gallons of paint to cover " +totalArea+ " square feet.");


    }
}
