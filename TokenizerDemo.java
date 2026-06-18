import java.util.StringTokenizer;
import java.util.Scanner;

public class TokenizerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);

        System.out.println("Total Words = " + st.countTokens());

        while(st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.println(word + " Length = " + word.length());
        }
    }
}