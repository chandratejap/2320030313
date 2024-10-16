package Emp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
            new Employee("Chandra Teja", 90000), 
            new Employee("Sriram", 65000),
            new Employee("Jayaram", 70000),
            new Employee("Shannu", 80000)
        );

        EmployeeManager manager = new EmployeeManager(employeeList);

        
        System.out.println("Employees with salary >= 60000:");
        manager.filterEmployeesBySalary(60000).forEach(System.out::println);
        


        System.out.println("\nEmployees sorted by salary (descending):");
        manager.sortEmployeesBySalary().forEach(System.out::println);
        


        Optional<Employee> highestSalaryEmployee = manager.findHighestSalaryEmployee();
        System.out.println("\nEmployee with the highest salary:");
        highestSalaryEmployee.ifPresent(System.out::println);
        


        OptionalDouble averageSalary = manager.calculateAverageSalary();
        System.out.println("\nAverage salary of employees:");
        if (averageSalary.isPresent()) {
            System.out.println(averageSalary.getAsDouble());
        } else {
            System.out.println("No employees to calculate average salary.");
        }
    }
}