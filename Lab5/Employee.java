public abstract class Employee {
    private String name; // Employee's name
    private int social; // Social security number

    // Default constructor
    public Employee() {}

    // Constructor with parameters
    public Employee(String newName, int newSocial) {
        name = newName;
        social = newSocial;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for social
    public int getSocial() {
        return social;
    }

    // Setter for social
    public void setSocial(int social) {
        this.social = social;
    }

    // Abstract method for calculating weekly pay
    public abstract double calculateWeeklyPay();
}
