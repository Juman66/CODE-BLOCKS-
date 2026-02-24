import java.util.Scanner;
public class maxof2 {
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = findMax(a, b);
        System.out.println("Maximum = " + max);
    }
}
