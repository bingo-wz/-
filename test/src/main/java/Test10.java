/**
 * 二分查找
 */

public class Test10 {
    public class Solution {
        public int upper_bound_ (int n, int v, int[] a) {
            int right = n - 1;
            int left = 0;

            // 循环变量：
            // 若v能被找到，则保证v在[left, right]这个左闭右闭区间中
            while (left <= right) {
                int mid = left + (right - left) / 2;
                // mid处的值和v相等，但是它可能并不是数组中第一个v
                // 因此继续缩小查找范围，排除掉重复的元素
                if (a[mid] >= v) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // 循环结束时left > right
            // 分为2种情况：
            // 情况1：找到v，此时left指向v
            // 情况2：未找到v，此时left指向v应该被插入的位置
            // 因为该题索引从1开始，因此返回值要加1
            return left + 1;
        }
    }
}
