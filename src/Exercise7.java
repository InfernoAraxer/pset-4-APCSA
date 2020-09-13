import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the one of the side lengths of your regular hexagon?");
        int side = input.nextInt();

        double height = side * Math.sin((60 * Math.PI) / 180);
        double triangleArea = (side * height) * .5;
        double area = triangleArea * 6;
        int perimeter = side * 6;

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Side      : " + side + "\n");
        System.out.println("Area      : " + nf.format(area));
        System.out.println("Perimeter : " + nf.format(perimeter));
    }
}
