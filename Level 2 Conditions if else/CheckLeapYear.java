import java.util.Scanner;
/*
15.Write a program to read a year and check whether it is a leap year or not.
*/
public class CheckLeapYear {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please enter the Year : ");
            if(input.hasNextInt()){
                int year = input.nextInt();
                
                //logic
                if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
                    System.out.println(year + " is a leap year :)");
                }else{
                    System.out.println(year + " is not a leap year :(");
            }
            }else{
                System.out.println("Invalid input!, Please enter a valid integer year :(");
            }

        }
    }
    
}
