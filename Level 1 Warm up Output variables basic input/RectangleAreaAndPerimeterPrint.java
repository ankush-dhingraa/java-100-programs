import java.util.Scanner;
public class RectangleAreaAndPerimeterPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter length of a rectangle : ");
        float  rectangleLength = input.nextFloat();
        System.out.print("Now, please enter breadth of a rectangle : ");
        float rectangleBreadth = input.nextFloat();

        // calculations
        float rectangleArea = rectangleLength * rectangleBreadth;
        float rectanglePerimeter = 2 * (rectangleBreadth + rectangleLength);

        // print the results
        System.out.printf("\nCalculating rectangle Area & Perimeter with \nLength : %.2f%nBreadth : %.2f%n\n", rectangleLength, rectangleBreadth);
        System.out.printf("Area of a rectangle is : %.2f%n", rectangleArea);
        System.out.printf("Perimeter of a rectangle is : %.2f%n", rectanglePerimeter);

        input.close();

    }
}
