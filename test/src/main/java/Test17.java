import java.util.*;

/**
 * 给定排序数组arr和整数k，不重复打印arr中所有相加和为k的严格升序的三元组
 */

public class Test17 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        int left = 0;
        int right = n - 1;
        int m = left + 1;
        while (left < right - 1) {
            //l++;
            if (left == 0 || arr[left] != arr[left - 1]) {
                //l不重复在比较m,r
                m = left + 1;
                right = n - 1;
                while (m < right) {
                    if (arr[left] + arr[m] + arr[right] == k) {
                        if ((m == 0 || arr[m] != arr[m - 1]) & arr[m] != arr[right])
                            System.out.println(arr[left] + " " + arr[m] + " " + arr[right]);
                        m++;
                        right--;
                    } else if (arr[left] + arr[m] + arr[right] < k)
                        m++;
                    else right--;
                }
            }
            left++;
        }
    }
}