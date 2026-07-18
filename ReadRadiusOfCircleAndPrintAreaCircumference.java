import java.util.*;
public class ReadRadiusOfCircleAndPrintAreaCircumference{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Radius of circle : ");
        float radiusOfCircle = input.nextFloat();
        double areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle;
        double circumferenceOfCircle = 2 * Math.PI * radiusOfCircle;

        System.out.printf("Area of circle with " + radiusOfCircle + " radius is : %.2f%n", areaOfCircle);
        System.out.printf("Circumference of circle is : %.2f%n", circumferenceOfCircle);
input.close();
    }
}