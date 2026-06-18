import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int start = 0, end = n-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array:");
        for(int x : arr)
            System.out.print(x + " ");
    }
}