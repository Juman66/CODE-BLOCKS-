import java.util.Scanner;
public class insertionsort2 {
    public static void insertion(int[]arr){
        int n= arr.length;
        for (int i = 1; i < n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }

        } 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        insertion(arr);
        for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
        }


    }

    
}