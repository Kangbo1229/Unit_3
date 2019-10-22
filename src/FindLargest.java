import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("Enter the second number: ");
        Scanner ek = new Scanner(System.in);
        int num2 = ek.nextInt();
        if (num < num2){
            System.out.println(num2 + " is larger than " + num);
        }
        if (num == num2 ){
            System.out.println(num + " and " + num2 + " are equal");
        }
        if (num > num2){
            System.out.println(num + " is larger than " + num2);
        }
  }
}
