/**
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] nums = line.split(" ");
            int n = nums.length;

            // 使用哈希表统计每个数出现的次数
            Map<String, Integer> countMap = new HashMap<>();
            for (String num : nums) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            // 找到出现次数大于等于 n/2 的数
            int targetCount = n / 2;
            for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() >= targetCount) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
        scanner.close();
    }
}
