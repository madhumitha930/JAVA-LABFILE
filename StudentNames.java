import java.util.*;

public class StudentNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Kavana");
        names.add("Rahul");
        names.add("Ananya");
        names.add("Priya");

        Collections.sort(names);

        System.out.println("Sorted Names:");
        for(String s : names)
            System.out.println(s);
    }
}