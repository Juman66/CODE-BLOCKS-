
import java.util.Scanner;

public class maxofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1 ");
        int x=sc.nextInt();
        System.out.println("enter number 2 ");
        int y= sc.nextInt();
        System.out.println("enter number 3 ");
        int z = sc.nextInt();

        if(x>y && x>z){
            System.out.println("number 1 is greater");
        }
        else if(y>x && y>z){
            System.out.println("number 2 is greater");
        }
        else{
            System.out.println("number 3 is greater");
        }
    }
}