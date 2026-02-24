import java.util.Scanner;
public class apseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term : ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference : ");
        int d = sc.nextInt();
        System.out.println("AP Series till 50 are :");
        for (int i = 0; i < 50; i++) {
            int term = a + i * d;
            System.out.print(term + " ,");
        }
    }
}