package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //get the max price for the 2 salarys
        double bobSalary = 1000;
        double garySalary = 2000;
        double higherSary = Math.max(bobSalary, garySalary);
        System.out.println("The higher Salary is $"+ higherSary);
        System.out.println("");

        //gets the min price for the 2 variables
        double carPrice = 5000;
        double truckPrice = 10000;
        System.out.println("The smallest price is $" + Math.min(carPrice, truckPrice));
        System.out.println("");

        //finds the area of a circle
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.printf("Area of the circle = %.2f%n", area);
        System.out.println("");

        //finds the area of a squareroot
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.printf("Square root = %.2f%n", squareRoot);
        System.out.println("");

        //prints  the distance between 2 points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance = %.2f%n", distance);
        System.out.println("");

    }
}
