import java.util.Scanner;

public class RightTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        if (a+b>c && a+c>b && b+c>a) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isRight(int a, int b, int c) {
        boolean one = Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
        boolean two = Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2);
        boolean three = Math.pow(c,2) + Math.pow(b,2) == Math.pow(a,2);
        return one || two || three;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ()
        System.out.println("The side lengths of "+a+" , "+b+" , and "+c+" form a right triangle");

    }

}
