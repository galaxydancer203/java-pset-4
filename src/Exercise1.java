import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature : ");
        double temp = input.nextDouble();
        System.out.print("Wind Speed  : ");
        double windSpeed = input.nextDouble();
        input.close();
        double wChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.printf("%nWind Chill : %,.2f", wChill);
    }
}
