import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;

        System.out.print("Enter  numbers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }

        System.out.println("Sum of Even Numbers = " + even);
        System.out.println("Sum of Odd Numbers = " + odd);
    }
}