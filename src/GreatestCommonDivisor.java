import java.io.PrintWriter;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        int a;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();
        printWriter.print(gcd(a, b));
        scanner.close();
        printWriter.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
