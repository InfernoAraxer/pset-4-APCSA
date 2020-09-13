import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some text you want reversed and capitalize.");
        String text = input.nextLine();
        String textCapitalized = text.toUpperCase();
        int length = textCapitalized.length();
        int divider = (int) (length * 0.5);
        String inBack = textCapitalized.substring(0, divider);
        String inFront = textCapitalized.substring(divider);

        System.out.println("Text : " + text + "\n");
        System.out.println(inFront + inBack + ".");
    }
}
