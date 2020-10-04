import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text : ");
        String text = input.nextLine();
        input.close();
        int length = text.length();
        int midpoint = (length / 2);
        String rtext = text.substring(midpoint, length).concat(text.substring(0, midpoint)).toUpperCase();
        System.out.printf("%n" + rtext + ".");
    }
}
