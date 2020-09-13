import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current temperature in fahrenheit.");
        int temperature = input.nextInt();
        System.out.println("Enter the current wind speed in mph.");
        int windSpeed = input.nextInt();

        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Temperature : " + temperature);
        System.out.println("Wind Speed  : " + windSpeed + "\n");
        System.out.println("Wind Chill  : " + nf.format(windChill));
    }
}
