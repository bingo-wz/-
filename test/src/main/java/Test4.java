/**
 * 数组的partition调整补充问题
 */

import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sortColors(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void sortColors(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        // 统计 0、1、2 的个数
        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        // 重新填充数组
        int index = 0;
        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }
        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }
        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }
    }
}
