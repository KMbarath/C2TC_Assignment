package com.KMbarath.assignment1.employees;

public class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, String employeeId, double salary,
                   String department, int teamSize) {
        super(name, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void promoteEmployee(Employee e, double raise) {
 
        e.increaseSalary(raise);
        System.out.println("Manager " + getName() + " promoted " + e.getName()
                           + " with a raise of " + raise);
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
               String.format(", Department: %s, TeamSize: %d", department, teamSize);
    }

}
