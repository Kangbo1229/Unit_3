import java.util.Scanner;

public class RightTriangle {
    public static boolean isTriangle(int a, int b, int c) {
        if (a+b>c) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isRight(int a, int b, int c) {
        int
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer sides of a triangle: ");
        int sides = scan.nextInt();
        System.out.println(isRight(sides));
    }

}
