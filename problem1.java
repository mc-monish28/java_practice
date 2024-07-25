import java.util.Scanner;

class Main {
    public static int solve(int r, int unit, int arr[], int n) {
        if (arr == null)
            return -1;
        int res = r * unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            count++;
            if (sum >= res)
                break;
        }
        if (sum < res)
            return 0;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rats (r):");
        int r = sc.nextInt();
        System.out.println("Enter the amount of food each rat consumes (unit):");
        int unit = sc.nextInt();
        System.out.println("Enter the number of houses (n):");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the amount of food in house " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum number of houses required: " + solve(r, unit, arr, n));
        sc.close();
    }
}
