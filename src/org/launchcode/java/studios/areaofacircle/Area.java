package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        double radius;
        double areaOfCircle;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of your circle?");


        if ( !input.hasNextInt() || !input.hasNextDouble() ) {
            System.out.println("ERROR: Your input must be a number.");
        }

        radius = input.nextDouble();


        while (radius < 0) {
            System.out.println("You entered a negative number. Please enter a positive number.");
            radius = input.nextDouble();
        }

        input.close();
        areaOfCircle = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + areaOfCircle);



    }
}
