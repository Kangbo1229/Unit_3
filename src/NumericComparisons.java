import java.util.Scanner;

public class NumericComparisons {

    public static boolean isOdd(int num1){

        return num1 % 2 != 0;
        }

        public static void main(String[] args) {
            System.out.print("Enter the number: ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            System.out.println(num + " is odd: " + isOdd(num));
            System.out.println(num + " is zero: " + isZero(num));
            System.out.println(num + " is posituve: " + isPositive(num));
            System.out.println(num + " is negative: " + isNegative(num));
            System.out.println(num + " is nonnegative: " + isNonNegative(num));
            System.out.println(num + " is nonpositive: " + isNonPositive(num));
        }

        public static boolean isZero(int num2) {

        return num2 == 0;
        }

        public static boolean isPositive(int num3){

        return num3 > 0;
        }

        public static boolean isNegative(int num4){

        return num4 < 0;
        }

        public static boolean isNonNegative(int num5){

        return num5 >= 0;
        }

        public static boolean isNonPositive(int num6){

        return num6 <= 0;
        }

}
