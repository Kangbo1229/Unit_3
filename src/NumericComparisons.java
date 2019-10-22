import java.util.Scanner;

public class NumericComparisons {

    public static boolean isOdd(int num){

        return num % 2 != 0;
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
            System.out.print("Enter the number: ");
            Scanner kb = new Scanner(System.in);
            int num2 = kb.nextInt();
            System.out.println(num + " is Factor of " + num2 + ": " + isFactor(num,num2));
            System.out.println(num + " is Multiple of " + num2 + ": " + isMultiple(num,num2));
        }

        public static boolean isZero(int num) {

        return num == 0;
        }

        public static boolean isPositive(int num){

        return num > 0;
        }

        public static boolean isNegative(int num){

        return num < 0;
        }

        public static boolean isNonNegative(int num){

        return num >= 0;
        }

        public static boolean isNonPositive(int num){

        return num <= 0;
        }

        public static boolean isFactor(int num, int num2){

        return num2%num == 0;
        }

        public static boolean isMultiple(int num, int num2){

        return num%num2 == 0;
        }

}
