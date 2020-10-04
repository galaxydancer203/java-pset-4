import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Side : ");
        double side = input.nextDouble();
        input.close();
        double perimeter = side * 6;
        double area = perimeter * side * Math.sqrt(3) / 4;
        System.out.printf("%nArea      : %,.2f%nPerimeter : %,.2f", area, perimeter);
    }
}
