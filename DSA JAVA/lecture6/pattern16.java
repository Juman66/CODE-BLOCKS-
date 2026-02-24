import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int space = n - i;
            while (space > 0) {
                System.out.print("  ");
                space--;
            }
            int num = 1;
            while (num <= (2 * i - 1)) {
                System.out.print(i + " ");
                num++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}