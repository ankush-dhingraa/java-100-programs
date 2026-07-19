/*
Write a program to read seconds and convert them into hours, minutes and seconds.
*/

import java.util.Scanner;
public class ConvertSecondsIntoHoursMinutesSeconds {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Please enter Seconds : ");
            int secondsByUser = input.nextInt();
            int hours = secondsByUser / 3600;
            int minutes = (secondsByUser % 3600)/60;
            int seconds = secondsByUser % 60;
            System.out.println("Hours : " + hours);
            System.out.println("Minutes : " + minutes);
            System.out.println("Seconds : " + seconds);

        }
    }
}
