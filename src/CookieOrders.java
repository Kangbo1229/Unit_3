import java.util.Scanner;

public class CookieOrders {
    public static String totalCost(int numBoxes) {
        if (numBoxes<1) {
            return ("Your input is invalid");
        }
        else if (numBoxes>0 && numBoxes<5 ) {
            double totalCost = (numBoxes*6.95);
           return ("You bought "+numBoxes+" boxes of cookies at $6.95 per box. Your total bill is "+totalCost);
        }
        else if (numBoxes>4 && numBoxes<10) {
            double totalCost = (numBoxes*5.95);
            return ("You bought "+numBoxes+" boxes of cookies at $5.95 per box. Your total bill is "+totalCost);
        }
        else if (numBoxes>9 && numBoxes<16) {
            double totalCost = (numBoxes*5.50);
            return ("You bought "+numBoxes+" boxes of cookies at $5.50 per box. Your total bill is "+totalCost);
        }
        else {
            double totalCost = (numBoxes*4.95);
            return ("You bought "+numBoxes+" boxes of cookies at $4.95 per box. Your total bill is "+totalCost);
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1-4 boxes:                6.95 per box");
        System.out.println("5-9 boxes:                5.95 per box ");
        System.out.println("10-15 boxes:                5.50 per box");
        System.out.println("16 or more boxes:            4.95 per box");
        System.out.println("Enter the number of boxes you wish to purchase: ");
        int boxes = scan.nextInt();
        System.out.println(totalCost(boxes));



    }
}
