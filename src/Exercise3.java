
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length   : ");
        double length = input.nextDouble();
        System.out.print("Width    : ");
        double width = input.nextDouble();
        System.out.print("Diameter : ");
        double diameter = input.nextDouble();
        input.close();
        double sArea = length * width - 3.1416 * 0.25 * Math.pow(diameter, 2);
        System.out.printf("%nSurface Area : %,.2f", sArea);
    }
}
