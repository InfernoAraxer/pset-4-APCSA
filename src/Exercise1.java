import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature : ");
        int temperature = input.nextInt();
        System.out.print("Wind Speed  : ");
        int windSpeed = input.nextInt();

        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);

        System.out.printf("\nWind Chill  : %,.2f", windChill);
    }
}
