/*
Write a program to read the marks of 5 subjects and print the total and average.
*/
import java.util.*;
public class PrintMarksTotalAndAverage {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Please enter your five subject marks ==>");
            float subject1;
            float subject2;
            float subject3;
            float subject4;
            float subject5;
            System.out.print("Subject 1 : ");
            subject1 = input.nextFloat();
            System.out.print("Subject 2 : ");
            subject2 = input.nextFloat();
            System.out.print("Subject 3 : ");
            subject3 = input.nextFloat();
            System.out.print("Subject 4 : ");
            subject4 = input.nextFloat();
            System.out.print("Subject 5 : ");
            subject5 = input.nextFloat();

            //calculating total and average
            float totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
            float averageMarks = totalMarks / 5;

            //display result
            System.out.println("Total marks of five subject is : " + totalMarks);
            System.out.println("Average marks of fice subject is : " + averageMarks);


        }
    }
}
