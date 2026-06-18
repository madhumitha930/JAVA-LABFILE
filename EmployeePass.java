class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeePass {
    static void display(Employee e) {
        System.out.println(e.empId);
        System.out.println(e.name);
        System.out.println(e.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Rahul", 50000);
        display(e1);
    }
}