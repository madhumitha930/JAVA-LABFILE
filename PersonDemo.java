class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class PersonDemo {

    static Person updatePerson(Person p) {
        p.name = "Rahul";
        return p;
    }

    public static void main(String[] args) {

        Person p = new Person("Kavana");

        p = updatePerson(p);

        System.out.println("Name: " + p.name);
    }
}