package com.barath.assignment_1;
import com.barath.assignment_1.employees.Developer;

import com.barath.assignment_1.employees.Manager;
import com.barath.assignment_1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 90000, "IT");
        Developer dev = new Developer("Bob", 102, 70000, "Java");

        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(mgr);
        System.out.println("Department: " + mgr.getDepartment());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(dev);
        System.out.println("Programming Language: " + dev.getProgrammingLanguage());
    }
}


