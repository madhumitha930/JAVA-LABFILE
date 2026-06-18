import java.util.Arrays;
import java.util.Scanner;

public class Mergearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];

        System.out.println("Enter first array:");
        for(int i=0;i<5;i++)
            a[i] = sc.nextInt();

        System.out.println("Enter second array:");
        for(int i=0;i<5;i++)
            b[i] = sc.nextInt();

        for(int i=0;i<5;i++)
            c[i] = a[i];

        for(int i=0;i<5;i++)
            c[i+5] = b[i];

        Arrays.sort(c);

        System.out.println("Merged Sorted Array:");
        for(int x : c)
            System.out.print(x + " ");
    }
}