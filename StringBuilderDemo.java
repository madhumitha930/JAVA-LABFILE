public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello ");
        sb.append("World");

        sb.insert(6, "Java ");

        System.out.println("After Insert: " + sb);

        sb.reverse();

        System.out.println("Reversed: " + sb);
    }
}