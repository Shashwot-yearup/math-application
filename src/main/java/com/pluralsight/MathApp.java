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
        

    }
}
