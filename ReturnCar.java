class Car {
    String model;
    double price;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
}

public class ReturnCar {

    static Car createCar() {
        return new Car("Swift", 700000);
    }

    public static void main(String[] args) {
        Car c = createCar();

        System.out.println("Model: " + c.model);
        System.out.println("Price: " + c.price);
    }
}