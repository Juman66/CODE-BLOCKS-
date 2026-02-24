import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b= rem;
        }
        System.out.println(b);
    }
}
//also
//while(b>0){
    //int r = a%b;
    //a=b;
    //b=rem;}
  //  system(a);
//}