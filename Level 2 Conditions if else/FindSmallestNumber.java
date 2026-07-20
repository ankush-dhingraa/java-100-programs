import java.util.Scanner;
/*
14.Write a program to read three numbers and find the smallest among them.
*/
public class FindSmallestNumber {
    public static void main(String[] args) {
        int smallestNum = 0;
        int totalNum = 3;
        int position = 0;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Please enter Numbers ==> ");
            for (int i = 1;i <= totalNum;i++){
                System.out.print("Number " + i + " : ");
                int number = input.nextInt();
                if(i == 1 || smallestNum > number){
                    smallestNum = number;
                    position = i;
                }
            }

        }
        //display result
        System.out.println("Smallest number is " + smallestNum + " at " + position + " position");
    }
}
