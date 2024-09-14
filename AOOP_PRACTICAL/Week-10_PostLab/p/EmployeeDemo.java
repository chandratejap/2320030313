package p;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        
        employeeList.addEmployee(new Employee(101, "Chandra Teja", "Marketing", 68000));
        employeeList.addEmployee(new Employee(102, "Sriram", "Engineering", 75000));
        employeeList.addEmployee(new Employee(103, "Jayaram", "Marketing", 65000));
        employeeList.addEmployee(new Employee(104, "Shannu", "Engineering", 60000));

        System.out.println("Employee details:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}