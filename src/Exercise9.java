import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First name  : ");
        input.hasNext();
        String firstName = input.nextLine();
        System.out.print("Middle name : ");
        String middleName = input.nextLine();
        System.out.print("Last name   : ");
        String lastName = input.nextLine();

        String initials = new StringBuilder().append(firstName.charAt(0)).append(middleName.charAt(0)).append(lastName.charAt(0)).toString();

        System.out.println("\n" + initials.toUpperCase() + ".");
        input.close();
    }
}
