/**
 * 给定一个红包的金额数组 gifts 及它的大小 n ，请返回所求红包的金额。
 * 若没有金额超过总数的一半，返回0。
 */

import java.util.*;
public class Test19 {
    public int getValue(int[] gifts, int n) {
        // 创建一个 HashMap 用于存储每个礼物的出现次数
        HashMap<Integer, Integer> giftCountMap = new HashMap<>();

        // 遍历礼物数组并更新 giftCountMap
        for (int i = 0; i < gifts.length; i++) {
            int gift = gifts[i];

            // 如果礼物不在 map 中，将其添加，并设置出现次数为 1
            if (!giftCountMap.containsKey(gift)) {
                giftCountMap.put(gift, 1);
            } else {
                // 否则，增加出现次数
                int occurrence = giftCountMap.get(gift);
                giftCountMap.put(gift, occurrence + 1);
            }

            // 如果出现次数达到或超过 n/2，返回该礼物的值
            if (giftCountMap.get(gift) > n / 2) {
                return gift;
            }
        }
        return 0;
    }
}