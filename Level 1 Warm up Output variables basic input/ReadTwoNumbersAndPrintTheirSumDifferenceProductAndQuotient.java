import java.util.*;
public class ReadTwoNumbersAndPrintTheirSumDifferenceProductAndQuotient{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter yout first number : ");
        int firstNum = input.nextInt();
        System.out.print("Now, please enter second number : ");
        int secondNum = input.nextInt();

        // performe some calculations 
        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;

        // displaying the result

        System.out.println("*".repeat(10));
        System.out.println("Sum of two numbers is : " + sum);
        System.out.println("Difference of two numbers is : " + 1*difference);
        System.out.println("Product of two numbers is : " + product);
        if(secondNum != 0){
            float quotient = (float) firstNum / secondNum;
            System.out.println("Quotient of two numbers is : " + quotient);

        }else{
            System.out.println("Quotient of two numbers is : cannot divide by Zero");
        }
        System.out.println("*".repeat(10));


input.close();
    }
}