package post;

public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Chandra Teja", "Manager");
        Employee emp2 = new Employee("Sriram", "Developer");
        Employee emp3 = new Employee("Jayaram", "Intern");
        Employee emp4 = new Employee("Shanmukha", "Designer");
        Employee emp5 = new Employee("Tanmai", "Tester");
        Employee emp6 = new Employee("Harshith", "Accountant");
        Employee emp7 = new Employee("Yashwanth", "HR");
        Employee emp8 = new Employee("Nivedith", "Sales");

        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println(emp1.getName() + "'s salary: $" + calculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s salary: $" + calculator.calculateSalary(emp2));
        System.out.println(emp3.getName() + "'s salary: $" + calculator.calculateSalary(emp3));
        System.out.println(emp4.getName() + "'s salary: $" + calculator.calculateSalary(emp4));
        System.out.println(emp5.getName() + "'s salary: $" + calculator.calculateSalary(emp5));
        System.out.println(emp6.getName() + "'s salary: $" + calculator.calculateSalary(emp6));
        System.out.println(emp7.getName() + "'s salary: $" + calculator.calculateSalary(emp7));
        System.out.println(emp8.getName() + "'s salary: $" + calculator.calculateSalary(emp8));
    }
}