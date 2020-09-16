import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First name  : ");
        String firstName = input.nextLine();
        System.out.print("Middle name : ");
        String middleName = input.nextLine();
        System.out.print("Last name   : ");
        String lastName = input.nextLine();

        char firstInitial;
        char middleInitial;
        char lastInitial;
        try { firstInitial = firstName.charAt(0);      }     catch (StringIndexOutOfBoundsException e)    { firstInitial = 0;       }
        try { middleInitial = middleName.charAt(0);    }     catch (StringIndexOutOfBoundsException e)    { middleInitial = 0;      }
        try { lastInitial = lastName.charAt(0);        }     catch (StringIndexOutOfBoundsException e)    { lastInitial = 0;        }
        String initials = new StringBuilder().append(firstInitial).append(middleInitial).append(lastInitial).toString();

        System.out.println("\n" + initials.toUpperCase() + ".");
    }
}
