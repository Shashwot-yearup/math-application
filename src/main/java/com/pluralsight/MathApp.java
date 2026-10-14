package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 1000;
        double garySalary = 2000;
        double higherSary = Math.max(bobSalary, garySalary);
        System.out.println("The higher Salary is $"+ higherSary);

        double carPrice = 5000;
        double truckPrice = 10000;
        System.out.println("The smallest price is $" + Math.min(carPrice, truckPrice));


    }
}
