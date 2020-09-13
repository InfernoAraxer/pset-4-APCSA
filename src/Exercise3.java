import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the length of your cornhole?");
        int length = input.nextInt();
        System.out.println("What's the width of your cornhole?");
        int width = input.nextInt();
        System.out.println("What's the diameter of the circle in your cornhole?");
        int diameter = input.nextInt();
        int area = length * width;

        double circleArea = Math.PI * (Math.pow(0.5 * diameter, 2));
        double totalArea = area - circleArea;

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Length        : " + length);
        System.out.println("Width         : " + width);
        System.out.println("Diameter      : " + diameter + "\n");
        System.out.println("Surface Area  : " + nf.format(totalArea));
    }
}
