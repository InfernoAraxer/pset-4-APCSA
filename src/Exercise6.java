import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length    : ");
        int length = input.nextInt();
        System.out.print("Width     : ");
        int width = input.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        double diagonal = StrictMath.hypot(length, width);

        System.out.printf("\nArea      : %,.2f%n", (double) area);
        System.out.printf("Perimeter : %,.2f%n", (double) perimeter);
        System.out.printf("Diagonal  : %,.2f%n", diagonal);
        input.close();
    }
}
