import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First Name  : ");
        String fName = input.nextLine();
        System.out.print("Middle Name : ");
        String mName = input.nextLine();
        System.out.print("Last Name   : ");
        String lName = input.nextLine();
        String initials = (fName.substring(0, 1) + mName.substring(0, 1) + lName.substring(0, 1)).toUpperCase();
        System.out.printf("%n" + initials + ".");
    }
}
