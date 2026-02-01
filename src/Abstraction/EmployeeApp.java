package Abstraction;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee1 = new Manager("Ivan", 10744, 700000.90, "Ivan@email.com");

        System.out.println(employee1.employeeDetails());

        ManagerRoles roles = new Manager();
        roles.executiveMeeting();

        SoftwareEngineersRoles roles2 = new SoftwareEngineer();
        roles2.codeReviews();
    }
}
