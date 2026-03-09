import java.util.Arrays;
import java.util.Scanner;
public class squareofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        int[]square = new int[n];
        for (int i = 0; i < square.length; i++) {
            square[i]= arr[i]* arr[i];
        }
        Arrays.sort(square);

        for (int i = 0; i < square.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(square[i]);
        }



    }
    
}
