import java.util.Scanner;

public class SlopeOfALine {
    public static String slope(int x1, int y1, int x2, int y2) {
        if (x1==x2) {
            return "The line defined by the points ("+x1+","+y1+") and ("+x2+","+y2+") is a vertical line and the slope is undefined.";
        }
        else {
            return "The The line defined by the points ("+x1+","+y1+") and ("+x2+","+y2+") has a slope of "+(double)(y2-y1)/(x2-x1);
        }

    }
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = scan.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scan.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scan.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scan.nextInt();
        System.out.println(slope(x1,y1,x2,y2));
    }
}
