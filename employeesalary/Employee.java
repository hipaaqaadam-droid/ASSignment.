package employeesalary;

public class Employee {
    protected String employeeID;
    protected String name;
    protected String department;
    protected double basicSalary;

    public Employee(String employeeID, String name,
                    String department, double basicSalary) {

        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public String getCategory() {
        return "Employee";
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Category: " + getCategory());
        System.out.printf("Monthly Salary: $%.2f%n",
                calculateSalary());
        System.out.println();
    }
}
