/**
 * 分金条的最小花费
 */

import java.util.*;
import java.io.*;
public class Test13 {
    public static void main(String[]args)throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        long [] arr = new long[n];
        String[]strs = b.readLine().trim().split(" ");

        for(int i= 0; i< n;i++){
            arr[i] = Integer.parseInt(strs[i]);
        }
        b.close();

        //计算树的带权路径长度最小值
        PriorityQueue<Long> min = new PriorityQueue<>();//创建一个最小堆，并将所有元素都加入
        for(int i = 0; i<n; i++){
            min.offer(arr[i]);
        }
        long res = 0, combine = 0;
        while(min.size() > 1){//建立最优二叉树，同时计算该树的带权路径长度。
            combine = min.poll() + min.poll();
            res += combine;
            min.offer(combine);
        }
        System.out.println(res);//如果n=1，直接返回0.
    }
}

