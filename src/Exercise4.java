import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of centimeters you want to convert.");
        double centimetersDouble = input.nextDouble();
        int centimeters = (int) centimetersDouble;

        int kilometers = centimeters / 100000;
        int afterKilometers = centimeters % 100000;
        int meters =  afterKilometers / 100;
        int afterMeters = afterKilometers % 100;

        System.out.println("Centimeters : " + centimeters + "\n");
        System.out.println("Kilometers  : " + kilometers);
        System.out.println("Meters      : " + meters);
        System.out.println("Centimeters : " + afterMeters);
    }
}
