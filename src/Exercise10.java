import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite city? ");
        String favCity = input.nextLine();

        System.out.println("\nText   : " + favCity);
        System.out.println("Length : " + favCity.length());
        System.out.println("Lower  : " + favCity.toLowerCase());
        System.out.println("Upper  : " + favCity.toUpperCase() + "\n");
        input.close();
    }
}
