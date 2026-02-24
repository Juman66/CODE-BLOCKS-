import java.util.Scanner;
public class pattern17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int row = 1;
        int num = 1;
        while (row <= n) {
            int space = n - row;
            while (space > 0) {
                System.out.print("   ");
                space--;
            }
            int count = 1;
            while (count <= (2 * row - 1)) {
                System.out.print(num + " ");
                num++;
                count++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}