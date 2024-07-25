import java.util.Scanner;

public class tcs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }
        int j = 0;
        while (count0 > 0) {
            arr[j++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[j++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[j++] = 2;
            count2--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
