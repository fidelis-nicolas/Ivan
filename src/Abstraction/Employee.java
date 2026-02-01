package Abstraction;

public abstract class Employee {
    private String name;
    private int employeeID;
    private double salary;
    private String email;


    public Employee(){

    }

    public Employee(String name, int employeeID, double salary, String email) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String employeeDetails();
    public abstract double calculateNetSalary();

}
