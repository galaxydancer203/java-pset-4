import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diameter : ");
        double diameter = input.nextDouble();
        input.close();
        double circumference = 3.1416 * diameter;
        double area = 3.1416 * 0.25 * Math.pow(diameter, 2);
        System.out.printf("%nArea          : %,.2f%nCircumference : %,.2f", area, circumference);
    }
}
