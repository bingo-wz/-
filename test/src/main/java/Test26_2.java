/**
 * 数组排序之后相邻数的最大差值
 */
import java.util.Arrays;
import java.util.Scanner;
public class Test26_2 {

    public static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums); // 使用排序算法对数组进行排序

        int maxGap = 0;
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }

        return maxGap;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxGap(arr));

    }
}