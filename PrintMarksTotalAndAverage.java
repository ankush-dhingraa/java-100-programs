/*
Write a program to read the marks of 5 subjects and print the total and average.
*/
import java.util.*;
public class PrintMarksTotalAndAverage {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int totalSubjects = 5;
            float totalMarks = 0;
            System.out.println("Please enter your five subject marks ==>");
            for(int i = 1;i <=totalSubjects;i++){
                System.out.print("Subject " + i + " : ");
                totalMarks += input.nextFloat();

            }

            float averageMarks = totalMarks / totalSubjects;
          
            // //display result
            System.out.println("Total marks of five subject is : " + totalMarks);
            System.out.println("Average marks of fice subject is : " + averageMarks);


        }
    }
}
