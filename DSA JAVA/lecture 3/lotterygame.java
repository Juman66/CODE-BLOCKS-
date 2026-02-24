import java.util.Scanner;

public class lotterygame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n >= 300 && n <= 460) {
            System.out.println("the price is MacBook");
        }
        else if (n >= 200 && n <= 280) {
            System.out.println("the price is Kurkure");
        }
        else if (n >= 1100 && n <= 1500) {
            System.out.println("the price is Cycle");
        }
        else if (n > 50 && n <= 80) {
            System.out.println("the price is Bike");
        }
        else {
            System.out.println("Better luck next time");
        }

        sc.close();
    }
}