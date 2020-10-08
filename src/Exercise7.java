import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Side : ");
        int side = input.nextInt();

        double height = side * Math.sin((60 * Math.PI) / 180);
        double triangleArea = (side * height) * .5;
        double area = triangleArea * 6;
        int perimeter = side * 6;

        System.out.printf("\nArea      : %,.2f%n", area);
        System.out.printf("Perimeter : %,.2f%n", (double) perimeter);
        input.close();
    }
}
