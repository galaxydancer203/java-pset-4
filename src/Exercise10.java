import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite city? ");
        String city = input.nextLine();
        int length = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        System.out.printf("%nText   : " + city + "%nLength : " + length + "%nUpper  : " + upper + "%nLower  : " + lower);
    }
}
