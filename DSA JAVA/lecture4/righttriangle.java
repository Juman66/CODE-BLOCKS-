import java.util.Scanner;
public class righttriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int sp = 1;
            while (sp <= n - i) {
                System.out.print(" ");
                sp++;
            }
            int st = 1;
            while (st <= i) {
                System.out.print("*");
                st++;
            }
            System.out.println();
            i++;
        }
    }
}