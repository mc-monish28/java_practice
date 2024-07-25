public class problem4 {
    public static int findCount(int arr[], int length, int num, int diff) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (Math.abs(num - arr[i]) <= diff) {
                count++;
            }
        }
        return count > 0 ? count : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println('Enter the number of elements:');
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println('Enter the array elements:');
            arr[i] = sc.nextInt();
        }
        System.out.println('Enter the num:');
        int num = sc.nextInt();
        System.out.println('Enter the diff:');
        int diff = sc.nextInt();

        int result = findCount(arr, n, num, diff);
        System.out.println("Absolute difference is:" +result);
    }
}
