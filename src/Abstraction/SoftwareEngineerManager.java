package Abstraction;

public class SoftwareEngineerManager extends Employee implements ManagerRoles, SoftwareEngineersRoles{
    @Override
    public String employeeDetails() {
        return "";
    }

    @Override
    public double calculateNetSalary() {
        return 0;
    }

    @Override
    public void executiveMeeting() {

    }

    @Override
    public void codeReviews() {

    }
}
