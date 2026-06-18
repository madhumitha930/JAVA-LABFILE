class EmployeeRecord {

    String name;
    double salary;

    static int totalEmployees = 0;

    EmployeeRecord(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployees++;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees = " + totalEmployees);
    }
}

public class EmployeeCount {

    public static void main(String[] args) {

        EmployeeRecord e1 = new EmployeeRecord("A", 30000);
        EmployeeRecord e2 = new EmployeeRecord("B", 40000);
        EmployeeRecord e3 = new EmployeeRecord("C", 50000);

        e1.display();
        e2.display();
        e3.display();

        EmployeeRecord.displayTotalEmployees();
    }
}