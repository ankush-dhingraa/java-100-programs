import java.util.Scanner;
/*
Write a program to read three numbers and find the largest among them.
*/
public class FindLargestNumber {
    public static void main(String[] args) {
        int largestNum = 0;
        int totalNum = 3;
        int position = 0;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Please enter Numbers ==> ");
            for (int i = 1;i <= totalNum;i++){
                System.out.print("Number " + i + " :");
                int number = input.nextInt();
                if(largestNum < number){
                    largestNum = number;
                    position = i;
                }
            }

        }
        //display result
        System.out.println("Larget number is " + largestNum + " at " + position + " position");
    }
}
