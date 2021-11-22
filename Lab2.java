import java.util.Scanner;
import java.util.stream.IntStream;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if (n >= 0 && n <= 15) {
            int factorial = 1;
            for (int i = 1; i <= n; ++i) {
                factorial *= i;
            }
            System.out.println("Result: " + factorial);
        } else {
            System.out.println("The number must be in [0, 15]");
        }
    }
}
