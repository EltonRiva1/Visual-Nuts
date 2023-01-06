import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final String VISUAL_NUTS = "Visual Nuts";
    private static final String NUTS = "Nuts";
    private static final String VISUAL = "Visual";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100:");
        try {
            int number = scanner.nextInt();
            if (number > 100)
                numberExceeded();
            for (int i = 1; i <= number; i++) {
                if (i % 15 == 0)
                    System.out.println(VISUAL_NUTS);
                else if (i % 5 == 0)
                    System.out.println(NUTS);
                else if (i % 3 == 0)
                    System.out.println(VISUAL);
                else
                    System.out.println(i);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number between 1 and 100");
        }
    }

    private static void numberExceeded() {
        System.out.println("Please enter a number between 1 and 100");
        System.exit(0);
    }
}