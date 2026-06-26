public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(5);

        management.addEmployee(new Employee(101, "Rahul", "Developer", 50000));
        management.addEmployee(new Employee(102, "Amit", "Tester", 40000));
        management.addEmployee(new Employee(103, "Yash", "Manager", 70000));
        management.addEmployee(new Employee(104, "Raj", "Designer", 45000));

        System.out.println("\nAll Employees:");
        management.traverseEmployees();

        System.out.println("\nSearching Employee 103:");
        management.searchEmployee(103);

        System.out.println("\nDeleting Employee 102:");
        management.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion:");
        management.traverseEmployees();
    }
}