import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the diameter you want to know the area and circumference of?");
        int diameter = input.nextInt();

        double circleArea = Math.PI * (Math.pow(0.5 * diameter, 2));
        double circleCircumference = Math.PI * diameter;

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Diameter      : " + diameter + "\n");
        System.out.println("Area          : " + nf.format(circleArea));
        System.out.println("Circumference : " + nf.format(circleCircumference));
    }
}
