import java.util.Scanner;
/*
20.Write a program to read the age of a person and check whether they are eligible to vote.
*/
public class CheckEligibleToVote {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            System.out.print("Please enter your age : ");
            if (input.hasNextInt()) {
                int age = input.nextInt();
                if (age <= 0 || age >= 122) {
                    System.out.println("Invalide age!, please enter a realistice age. ");
                    
                }
                else if(age >=18){
                    System.out.println("Your are eligible to Vote. ");
                }else{
                    System.out.println("Sorry, You are not eligible to vote. ");
                }
            }else{
                    System.out.println("invalid input!");
                }
        }
    }
    
}
