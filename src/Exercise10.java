import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your favorite city?");
        String favCity = input.nextLine();

        System.out.println("What's your favorite city? " + favCity + "\n");
        System.out.println("Text   : " + favCity);
        System.out.println("Length : " + favCity.length());
        System.out.println("Lower  : " + favCity.toLowerCase());
        System.out.println("Upper  : " + favCity.toUpperCase());
    }
}
