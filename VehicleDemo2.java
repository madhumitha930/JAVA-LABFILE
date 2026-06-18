class VehicleInfo {

    private String brand;
    protected int speed;
    String fuelType;

    VehicleInfo() {
        brand = "Honda";
        speed = 80;
        fuelType = "Petrol";
    }

    VehicleInfo(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class VehicleDemo2 {
    public static void main(String[] args) {

        VehicleInfo v1 = new VehicleInfo();
        VehicleInfo v2 = new VehicleInfo("Toyota", 120, "Diesel");

        v1.displayDetails();
        System.out.println();
        v2.displayDetails();
    }
}