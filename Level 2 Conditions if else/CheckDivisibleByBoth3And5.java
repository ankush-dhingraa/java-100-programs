import java.util.Scanner;
/*
19.Write a program to read a number and check whether it is divisible by both 3 and 5.
*/
public class CheckDivisibleByBoth3And5 {
    public static void main(String[] args) {
    
    try(Scanner input = new Scanner(System.in)){
        System.out.print("Please enter a number : ");
        if(input.hasNextInt()){
            int number = input.nextInt();
            if (number % 3 == 0 && number % 5 == 0) {

                System.out.println(number + " is divisible by both 3 and 5. ");                
            }else{
                System.out.println(number + " is not divisible by both 3 and 5. ");
            }
        }else{
            System.out.println("invalid input!");
        }
    }    
}
}