import java.util.Scanner;
/*
17.Write a program to read a character and check whether it is an alphabet, digit or special
symbol.
*/

public class CheckCharacterIsAlphabetDigitSpecialSymbol{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please enter a character : ");
            if(input.hasNext()){
                String userString = input.next();
                char userChar = userString.charAt(0);

                if(Character.isAlphabetic(userChar)){
                    System.out.println(userChar + " is Alphabet. ");
                }else if(Character.isDigit(userChar)){
                    System.out.println(userChar + " is Digit. ");
                }else{
                    System.out.println(userChar + " is Special Symbol");
                }
            }else{
                System.out.println("invalid input!");
            }
        }
    }
    
}
