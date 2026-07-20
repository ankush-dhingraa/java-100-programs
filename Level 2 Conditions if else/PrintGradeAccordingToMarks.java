import java.util.Scanner;
/*
18.Write a program to read the marks of a student and print the grade (A/B/C/D/Fail).
*/
public class PrintGradeAccordingToMarks {
    public static void main(String[] args) {
        
    
    try(Scanner input = new Scanner(System.in)){
        System.out.print("Please enter your marks : ");
        if (input.hasNextFloat()) {
            float marks = input.nextFloat();
            if(marks > 100 || marks < 0){
                System.out.println("invalid marks!, marks can not more than 100 or a negative number ");
            }else if (marks >= 95) {
                System.out.println("Grade A");
            }else if(marks >= 80){
                System.out.println("Grade B");
            }else if(marks >= 60){
                System.out.println("Grade C");
            }else if(marks >= 40){
                System.out.println("Grade D");
            }else{
                System.out.println("Fail");
            }
        }else{
            System.out.println("invalid input!");
        }

    }
    
}}
