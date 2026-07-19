import java.util.Scanner;
public class TemperatureConvert {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Temperature Convertor Celsius to Fahrenheit");
            System.out.print("Please enter temperature in celsius : ");
            double celsius = input.nextDouble();

            //converstion celsius to fahrenheit

            double fahrenheit = (celsius * 9.0/5) +32;

            System.out.println("Temperature in Fahrenheit is : " + fahrenheit);

        }
    }
}
