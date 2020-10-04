import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length : ");
        double length = input.nextDouble();
        System.out.print("Width  : ");
        double width = input.nextDouble();
        input.close();
        double perimeter = 2 * (length + width);
        double area = length * width;
        double diagonal = Math.sqrt(length * length + width * width);
        System.out.printf("%nArea      : %,.2f%nPerimeter : %,.2f%nDiagonal  : %,.2f", area, perimeter, diagonal);
    }
}
