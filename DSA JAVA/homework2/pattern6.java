import java.util.Scanner;
public class pattern6 {
    public static void printPattern(int height) {
        int space = height - 1;
        int star = 1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                if (k % 2 == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
            space--;
            star += 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        printPattern(height);
    }
}