package com.KMbarath.assignment1;

import com.KMbarath.assignment1.employees.Manager;
import com.KMbarath.assignment1.employees.Developer;
import com.KMbarath.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("BARATH", "04", 80000.0, "Sales", 8);
        Developer dev = new Developer("ASHWIN", "03", 60000.0, "Java", "Mid");

        System.out.println("=== Initial Details ===");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== Annual Salaries ===");
        System.out.printf("%s annual: %.2f%n", mgr.getName(),
                          EmployeeUtilities.calculateAnnualSalary(mgr));
        System.out.printf("%s annual: %.2f%n", dev.getName(),
                          EmployeeUtilities.calculateAnnualSalary(dev));

        System.out.println("\n=== Give bonus to developer (using utilities) ===");
        EmployeeUtilities.giveBonus(dev, 5000.0);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== Manager promotes developer ===");
        mgr.promoteEmployee(dev, 2000.0);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== Developer commits code ===");
        dev.commitCode(120);
    }
}
