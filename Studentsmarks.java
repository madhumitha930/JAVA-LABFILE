import java.util.Scanner;

public class Studentsmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int sum = 0, highest;

        System.out.println("Enter marks:");
        for(int i=0;i<5;i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double avg = sum / 5.0;
        highest = marks[0];

        for(int i=0;i<5;i++) {
            if(marks[i] > highest)
                highest = marks[i];
        }

        int count = 0;
        for(int i=0;i<5;i++) {
            if(marks[i] > avg)
                count++;
        }

        System.out.println("Average = " + avg);
        System.out.println("Highest = " + highest);
        System.out.println("Above Average Students = " + count);
    }
}