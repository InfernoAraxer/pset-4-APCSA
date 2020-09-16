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

        System.out.printf("\nArea      : %,.2f", (double) area);
        System.out.printf("\nPerimeter : %,.2f", (double) perimeter);
        System.out.printf("\nDiagonal  : %,.2f", diagonal);
    }
}
