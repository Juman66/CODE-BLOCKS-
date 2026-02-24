import java.util.Scanner;
public class rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            int last = arr[n - 1];
            for (int i = n - 1; i >=1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
 // swap arr[i], arr(r-1)