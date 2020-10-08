import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diameter : ");
        int diameter = input.nextInt();

        double circleArea = Math.PI * (Math.pow(0.5 * diameter, 2));
        double circleCircumference = Math.PI * diameter;

        System.out.printf("\nArea          : %,.2f%n", circleArea);
        System.out.printf("Circumference : %,.2f%n", circleCircumference);
        input.close();
    }
}
