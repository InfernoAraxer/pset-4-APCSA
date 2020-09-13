import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of inches you want to convert.");
        double inchesDouble = input.nextDouble();
        int inches = (int) inchesDouble;

        int miles = inches / 63360;
        int afterMiles = inches % 63360;
        int feet = afterMiles / 12;
        int afterFeet = afterMiles % 12;

        System.out.println("Inches : " + inches + "\n");
        System.out.println("Miles  : " + miles);
        System.out.println("Feet   : " + feet);
        System.out.println("Inches : " + afterFeet);
    }
}
