package com.KMbarath.assignment1.employees;

public class Developer extends Employee {
    private String programmingLanguage;
    private String level;

    public Developer(String name, String employeeId, double salary,
                     String programmingLanguage, String level) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.level = level;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void commitCode(int lines) {
        System.out.println(getName() + " committed " + lines + " lines in " + programmingLanguage);
    }

    @Override
    public String getDetails() {
        return super.getDetails() +
               String.format(", Language: %s, Level: %s", programmingLanguage, level);
    }

}
