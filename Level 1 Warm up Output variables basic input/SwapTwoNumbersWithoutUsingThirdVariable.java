import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter first number : ");
            int firstNum = input.nextInt();
            System.out.print("Now, please enter second number : ");
            int secondNum = input.nextInt();

            System.out.println("\nBefore swaping\nFirst number : " + firstNum + "\nSecond number : " + secondNum);

            firstNum = firstNum + secondNum;
            secondNum = firstNum - secondNum;
            firstNum = firstNum - secondNum;


            /*
            this is a best method
            using XOR because it can prevent from airthmetice overflow

            Why use it?
            Unlike addition (+), bitwise XOR works purely by flipping individual binary bits.
            Because it never physically increases the size of the number,
            it can never cause an integer overflow error, making it incredibly safe and 
            lightning-fast for low-level systems programming. 

            */

            // firstNum = firstNum ^ secondNum;
            // System.out.println(firstNum);
            // secondNum = firstNum ^ secondNum;
            // firstNum = firstNum ^ secondNum;

            System.out.println("\nAfter swaping\nFirst number : " + firstNum + "\nSecond number : " + secondNum);

        }

    }
}