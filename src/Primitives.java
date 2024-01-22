import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        int ds;
//      test comment
        char letter = 's';
        float dice = 321321.23123f;
        double notes = 3232.232;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me a number");
        int roll = scanner.nextInt();
        System.out.println("Your number is: " + roll);

    }
}
