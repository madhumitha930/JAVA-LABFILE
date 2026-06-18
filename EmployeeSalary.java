class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSalary {
    static void increaseSalary(Employee e) {
        e.salary = e.salary + (e.salary * 0.10);
    }

    public static void main(String[] args) {
        Employee e = new Employee(50000);

        System.out.println("Before Increment: " + e.salary);

        increaseSalary(e);

        System.out.println("After Increment: " + e.salary);
    }
}