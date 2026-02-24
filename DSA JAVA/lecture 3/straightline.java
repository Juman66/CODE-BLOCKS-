
import java.util.Scanner;

public class straightline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter number 1");
        float x1=sc.nextFloat();
        System.out.println("enter number 2");
        float x2=sc.nextFloat();
        System.out.println("enter number 3");
        float x3=sc.nextFloat();
        System.out.println("enter number 4");
        float y1=sc.nextFloat();
        System.out.println("enter number 5");
        float y2=sc.nextFloat();
        System.out.println("enter number 6");
        float y3=sc.nextFloat();
        float m1 = y2-y1/x2-x1;
        float m2 = y3-y2/x3-x2;
        if (m1==m2){
            System.out.println("it is a straight line ");
        }else{
            System.out.println("not a straight line");
        }
    }
}
