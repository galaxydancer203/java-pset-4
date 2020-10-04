import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Centimeters : ");
        int cm = input.nextInt();
        input.close();
        int km = (cm - cm % 100000) / 100000;
        cm -= km * 100000;
        int m = (cm - cm % 100) / 100;
        cm -= m * 100;
        System.out.printf("%nKilometers  : %,d%nMeters      : %,d%nCentimeters : %,d", km, m, cm);
    }
}
