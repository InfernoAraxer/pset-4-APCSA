import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the length of your rectangle?");
        int length = input.nextInt();
        System.out.println("What's the width of your rectangle?");
        int width = input.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        double diagonal = StrictMath.hypot(length, width);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Length    : " + length);
        System.out.println("Width     : " + width + "\n");
        System.out.println("Area      : " + nf.format(area));
        System.out.println("Perimeter : " + nf.format(perimeter));
        System.out.println("Diagonal  : " + nf.format(diagonal));
    }
}
