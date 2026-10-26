package employeesalary;

public class MAIN {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee(
                        "EMP001", "Ahmed Ali", "IT", 500, 150
                ),

                new PartTimeEmployee(
                        "EMP002", "RAHMA Adem", "Finance", 20, 12
                ),

                new Manager(
                        "EMP003", "yusro khaliif", "Management", 1000, 200
                )
        };

        System.out.println("===== EMPLOYEE SALARY REPORT =====");
        System.out.println();

        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
