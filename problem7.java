import java.util.Scanner;

public class problem7 {
    private static int findsolution;

    public static int findsolution(int n, int m) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < m; i++) {
            if (i % n == 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 + i;
            }
        }
        return Math.abs(sum1 - sum24);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findsolution(n, m));
    }
}
