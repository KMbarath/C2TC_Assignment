package com.KMbarath.assignment2;

public class MainClass {
    public static void main(String[] args) {
        // Demonstrating Student class
        Student s = new Student();

        // Demonstrating Commission class
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}

