import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inches : ");
        int inches = input.nextInt();
        input.close();
        int miles = (inches - inches % (12 * 5280)) / (12 * 5280);
        inches -= miles * 12 * 5280;
        int feet = (inches - inches % 12) / 12;
        inches -= feet * 12;
        System.out.printf("%nMiles  : %,d%nFeet   : %,d%nInches : %,d", miles, feet, inches);
    }
}
