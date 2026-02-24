public class printeven {
    public static void printEven() {
        for (int i = 1; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printEven();
    }
}
