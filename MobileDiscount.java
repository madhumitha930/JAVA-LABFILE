class Mobile {
    double price;

    Mobile(double price) {
        this.price = price;
    }
}

public class MobileDiscount {

    static void applyDiscount(Mobile m) {
        m.price = m.price - (m.price * 0.10);
    }

    public static void main(String[] args) {

        Mobile m = new Mobile(30000);

        System.out.println("Original Price: " + m.price);

        applyDiscount(m);

        System.out.println("Discounted Price: " + m.price);
    }
}