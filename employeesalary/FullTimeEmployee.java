package employeesalary;

public class FullTimeEmployee extends Employee {

        private double allowance;

        public FullTimeEmployee(String employeeID, String name,
                                String department, double basicSalary,
                                double allowance) {

            super(employeeID, name, department, basicSalary);
            this.allowance = allowance;
        }

        @Override
        public double calculateSalary() {
            return basicSalary + allowance;
        }

        @Override
        public String getCategory() {
            return "Full-Time Employee";
        }
    }

