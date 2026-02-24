import java.util.Scanner;

public class pyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int space = 0;
        int star = 2*height-1;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star-=2;
        }
    }
}