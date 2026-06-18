import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("Enter String: ");
        str = sc.nextLine();

        int vowels = 0, consonants = 0;

        for(int i=0;i<str.length();i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if(Character.isLetter(ch)) {
                if("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        String reverse = "";

        for(int i=str.length()-1;i>=0;i--)
            reverse += str.charAt(i);

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Reverse = " + reverse);
    }
}