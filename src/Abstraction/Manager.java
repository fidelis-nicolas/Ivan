package Abstraction;

public class Manager extends Employee implements ManagerRoles{
    private final double bonus = getSalary() * 0.25;

    public Manager(String name, int employeeID, double salary, String email) {
        super(name, employeeID, salary, email);

    }

    public Manager(){

    }

    @Override
    public String employeeDetails() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(getName());
        builder.append("\n");
        builder.append("Salary: ").append(getSalary());
        builder.append("\n");
        builder.append("Id: ").append(getEmployeeID());
        builder.append("\n");
        builder.append("Email: ").append(getEmail());
        builder.append("\n");
        builder.append("Bonus: ").append(getBonus());
        builder.append("\n");
        builder.append("Net Salary: ").append(calculateNetSalary());
        builder.append("\n");

        return builder.toString();
    }

    @Override
    public double calculateNetSalary() {
        return bonus + getSalary();
    }



    public double getBonus() {
        return bonus;
    }

    @Override
    public void executiveMeeting() {
        System.out.println("Board meeting " + meetingVenue);
    }
}
