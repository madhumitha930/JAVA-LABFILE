class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ReturnProduct {

    static Product createProduct() {
        return new Product("Laptop", 55000);
    }

    public static void main(String[] args) {
        Product p = createProduct();

        System.out.println("Product: " + p.name);
        System.out.println("Price: " + p.price);
    }
}