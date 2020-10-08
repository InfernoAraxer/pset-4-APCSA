import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length   : ");
        int length = input.nextInt();
        System.out.print("Width    : ");
        int width = input.nextInt();
        System.out.print("Diameter : ");
        int diameter = input.nextInt();
        int area = length * width;

        double circleArea = Math.PI * (Math.pow(0.5 * diameter, 2));
        double totalArea = area - circleArea;

        System.out.printf("\nSurface area : %,.2f%n", totalArea);
        input.close();
    }
}
