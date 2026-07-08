import java.util.ArrayList;

// Parent class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

// Child class - Full Time
class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    double calculateSalary() {
        return salary; // fixed monthly salary
    }
}

// Child class - Part Time
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Sreya", 50000));
        employees.add(new PartTimeEmployee("Arjun", 300, 80));

        for (Employee e : employees) {
            System.out.println("Name: " + e.name + " | Salary: " + e.calculateSalary());
        }
    }
}