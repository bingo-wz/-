/**
 * 在数组中找到出现次数大于n/k的数
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Test8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");
        int n = Integer.parseInt(params[0]), k = Integer.parseInt(params[1]);
        String[] strArr = br.readLine().split(" ");
        long[] arr = new long[n];
        HashMap<Long, Integer> counter = new HashMap<>();
        for(int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(strArr[i]);
            counter.put(arr[i], counter.getOrDefault(arr[i], 0) + 1);
        }
        boolean flag = false;
        for(long key: counter.keySet()){
            if(counter.get(key) > n / k) {
                flag = true;
                System.out.print(key + " ");
            }
        }
        if(!flag) System.out.println(-1);
    }
}