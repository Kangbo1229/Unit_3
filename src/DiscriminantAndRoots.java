import java.util.Scanner;

public class DiscriminantAndRoots {
    public static String roots(int a, int b, int c) {
        double d = Math.pow(b, 2);
        double e = 4 * a * c;
        double dis = d - e;
        if (dis == 0) {
            return "1x^2 + 4x + 4 has 1 real root";
        }
        if (dis <= 0) {
            return "1x^2 + 2x + 3 has 2 imaginary roots";
        }
        if (dis >= 0) {
            return "1x^2 + 5x + 6 has 2 real roots";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(roots(a, b, c));



    }
}
