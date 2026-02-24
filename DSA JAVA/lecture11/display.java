import java.util.Scanner;
public class display {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length");
        int n= sc.nextInt();
        int[]arr= new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("enter the data ");
            arr[i]= sc.nextInt();
        }
         for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+ " ");
         }

    }
    
}