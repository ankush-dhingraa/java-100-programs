import java.util.Scanner;
/*
Write a program to read a number and check whether it is even or odd.
*/
public class CheckEvenOrOdd {
    public static void main(String[] args) {
    
        try(Scanner input = new Scanner(System.in))
        {
            System.out.print("Please enter your number : ");
            if(input.hasNextInt()){

            int num = input.nextInt();

            //checking wheather it is even or odd
            if (num % 2 == 0){
                System.out.println("The number is Even ");
            }else{
                System.out.println("The number is Odd");
            }
                }
        }
}    
}
