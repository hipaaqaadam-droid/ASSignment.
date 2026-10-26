package employeesalary;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeID, String name,
                            String department, int hoursWorked,
                            double hourlyRate) {

        super(employeeID, name, department, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getCategory() {
        return "Part-Time Employee";
    }
}
