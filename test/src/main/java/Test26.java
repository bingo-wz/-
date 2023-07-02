/**
 * 数组排序之后相邻数的最大差值
 */
import java.util.Arrays;
import java.util.Scanner;
public class Test26 {

    public static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // 找出数组的最小值和最大值
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        // 如果最小值和最大值相等，则所有元素都相等，最大差值为0
        if (min == max) {
            return 0;
        }

        // 计算桶的大小和数量
        int bucketSize = Math.max(1, (max - min) / (len - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        // 初始化每个桶的最小值和最大值
        int[] minBucket = new int[bucketCount];
        int[] maxBucket = new int[bucketCount];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        // 将每个元素放入对应的桶中，并更新桶的最小值和最大值
        for (int num : nums) {
            int index = (num - min) / bucketSize;
            minBucket[index] = Math.min(minBucket[index], num);
            maxBucket[index] = Math.max(maxBucket[index], num);
        }

        // 计算最大差值
        int maxGap = 0;
        int prevMax = maxBucket[0];
        for (int i = 1; i < bucketCount; i++) {
            if (minBucket[i] != Integer.MAX_VALUE) {
                maxGap = Math.max(maxGap, minBucket[i] - prevMax);
                prevMax = maxBucket[i];
            }
        }

        return maxGap;
    }

    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
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
