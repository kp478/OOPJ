public class Employee {
    public void calculateSalary(int hoursWorked, int hourlyRate) {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Salary: ₹" + salary);
    }
    
    public void calculateSalary(double monthlySalary) {
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }
    
    public void calculateSalary(String designation) {
        // Logic to calculate salary based on designation
        int salary = 0;
        if (designation.equals("Data Scientist")) {
            salary = 60000; // Monthly salary for Data Scientist
        } else if (designation.equals("Developer")) {
            salary = 50000; // Monthly salary for Developer
        }
        System.out.println("Salary for " + designation + ": ₹" + salary);
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        employee.calculateSalary(70, 10);
        employee.calculateSalary(60000.0);
        employee.calculateSalary("Data Scientist");
    }
}