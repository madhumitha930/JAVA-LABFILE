import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println("Even Numbers:");

        for(int i=0;i<n;i++) {
            if(arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}