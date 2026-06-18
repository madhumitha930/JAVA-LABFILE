class MobileInfo {

    String brand;
    String model;
    double price;

    MobileInfo(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    MobileInfo(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 10000;
    }

    void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobileDemo {

    public static void main(String[] args) {

        MobileInfo m1 = new MobileInfo("Samsung", "S24", 75000);
        MobileInfo m2 = new MobileInfo("Redmi", "Note13");

        m1.displayMobile();
        System.out.println();
        m2.displayMobile();
    }
}