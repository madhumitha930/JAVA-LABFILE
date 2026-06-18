import java.util.*;

public class ArrayListDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(40);
        list.add(60);
        list.add(50);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        System.out.println("Final List:");
        System.out.println(set);
    }
}