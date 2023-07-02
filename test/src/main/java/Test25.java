/**
 * 数组中出现了奇数次的数字
 * 给定一个数字arr，其中只有有两个数字出现了奇数次，
 * 其它数字都出现了偶数次，按照从小到大顺序输出这两个数。
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;
public class Test25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                int b = in.nextInt();
                arr[i] = b;
            }

            HashMap<Integer, Integer> countMap = new HashMap<>();

            //统计每个数字出现的次数
            for (int num : arr) {
                //如果key=num时有值，则返回这个值，如果没有，则默认为0
                Integer count = countMap.getOrDefault(num, 0);
                //把存入map里的key的值在原有的基础上+1
                countMap.put(num, count + 1);
            }

            // 使用 TreeSet 来存储按从小到大排序的数字
            TreeSet<Integer> sortedSet = new TreeSet<>();

            for (int num : countMap.keySet()) {
                if (countMap.get(num) % 2 != 0){
                    sortedSet.add(num);
                }
            }
            for (int num : sortedSet) {
                System.out.print(num+" ");
            }
        }
    }
}
