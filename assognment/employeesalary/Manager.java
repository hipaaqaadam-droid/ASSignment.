package employeesalary;

public class Manager extends Employee{
    private double bonus;

    public Manager(String employeeID, String name,
                   String department, double basicSalary,
                   double bonus) {

        super(employeeID, name, department, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String getCategory() {
        return "Manager";
    }
}
