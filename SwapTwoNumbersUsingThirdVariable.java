import java.util.Scanner;
public class SwapTwoNumbersUsingThirdVariable {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please enter first number : ");
            int firstNum = input.nextInt();
            System.out.print("Now, please enter second number : ");
            int secondNum = input.nextInt();

            System.out.println("\nBefore swaping\nFirst number : " + firstNum + "\nSecond number : " + secondNum);
            int temp = firstNum;
            firstNum = secondNum;
            secondNum = temp;

            System.out.println("\nAfter swaping\nFirst number : " + firstNum + "\nSecond number : " + secondNum);

            


        }
    }
}
