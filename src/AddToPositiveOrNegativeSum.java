import java.util.Scanner;

public class AddToPositiveOrNegativeSum {
        public static void main(String[] args)    {
         int p = 0;
         int n = 0;
            for (int i = 1; i <= 10; i++)        {
                System.out.print("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                if (num>0) {
                    p += num;
                }
                if (num<0) {
                    n += num;
                }
          }
            System.out.println("The sum of the positive numbers is " + p);
            System.out.println("The sum of the negative numbers is " + n);


            //output the sums    }
        }

    }
