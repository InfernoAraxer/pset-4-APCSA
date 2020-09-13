import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name.");
        String firstName = input.nextLine();
        System.out.println("Enter middle name.");
        String middleName = input.nextLine();
        System.out.println("Enter last name.");
        String lastName = input.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        String initials = new StringBuilder().append(firstInitial).append(middleInitial).append(lastInitial).toString();

        System.out.println("First name  : " + firstName);
        System.out.println("Middle name : " + middleName);
        System.out.println("Last name   : " + lastName + "\n");
        System.out.println(initials.toUpperCase() + ".");
    }
}
