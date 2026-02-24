import java.util.Scanner;
public class pattern13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int i =1;
        while (i <= 2*n-1) {
            int j = 1;
            while (j <= star) {
                System.out.print("*");
                j++;
            }
            if(i<n){
                star++;
            }else{
                star--;
            }
            System.out.println();
            i++;
        }
    }
}
