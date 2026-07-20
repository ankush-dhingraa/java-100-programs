import java.util.Scanner;

/*
16.Write a program to read a character and check whether it is a vowel or a consonant.
*/
public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter a single character : ");
            String userString = input.next();
            char userChar = Character.toLowerCase(userString.charAt(0));

            if (Character.isLetter(userChar)) {

                if (userChar == 'a' || userChar == 'e' || userChar == 'i' || userChar == 'o' || userChar == 'u') {
                    System.out.println(userString.charAt(0) + " is a vowel.");

                } else {
                    System.out.println(userString.charAt(0) + " is a consonant.");
                }
            } else {
                System.out.println("invaid input!");
            }

        }
    }
}
