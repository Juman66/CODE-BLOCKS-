import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prime=1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                prime =0;
                break;
            }
        }
        if (prime == 1) {
            System.out.println(n + "  Prime Number");
        } else {
            System.out.println(n + "  Not a Prime Number");
        }

    }
}