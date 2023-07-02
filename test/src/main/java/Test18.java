/**
 * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
 */

import java.util.*;
public class Test18 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        while(sr.hasNext()) {
            int n=sr.nextInt();
            List<String> strList = new ArrayList<>();

            for(int i=0;i<n;i++) {
                String input = sr.next();
                strList.add(input);
            }
            Collections.sort(strList);

            for (String str : strList) {
                System.out.println(str);
            }
        }
    }
}