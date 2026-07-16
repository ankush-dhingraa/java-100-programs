import java.util.Scanner;

public class ReadTwoNumbersAndPrintTheirSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number : ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter second number : ");
        int secondNum = input.nextInt();

        //calculating sum of two numbers
        int sum = firstNum + secondNum;
        System.out.println("Sum of two number is : " + sum );
        input.close();
    }
}
