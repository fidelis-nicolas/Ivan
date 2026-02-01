package Abstraction;

public class SoftwareEngineer extends Employee implements SoftwareEngineersRoles{
    @Override
    public String employeeDetails() {
        return "";
    }

    @Override
    public double calculateNetSalary() {
        return 0;
    }

    @Override
    public void codeReviews() {
        System.out.println("Code review currently taking place");
    }
}
