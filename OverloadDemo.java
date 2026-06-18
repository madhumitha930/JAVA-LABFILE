class Display {

    void display(String str) {
        System.out.println("String Value: " + str);
    }

    void display(int num) {
        System.out.println("Integer Value: " + num);
    }
}

public class OverloadDemo {

    public static void main(String[] args) {

        Display d = new Display();

        d.display("Java");
        d.display(100);
    }
}