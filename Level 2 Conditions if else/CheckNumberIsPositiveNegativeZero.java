import java.util.Scanner;
/*
12.Write a program to read a number and check whether it is positive, negative or zero.
*/
public class CheckNumberIsPositiveNegativeZero {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please enter the number : ");
            if(input.hasNextInt()){
                int number = input.nextInt();
                if (number > 0) {
                    System.out.println(number + " : is a positive number");
                }else if(number<0){
                    System.out.println(number + " : is a negative number");
                }else{
                    System.out.println(number + " : is a Zero");
                }
            }
        }
    }
}
