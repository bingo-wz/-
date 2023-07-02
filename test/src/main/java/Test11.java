/**
 * 小红的ABC
 * 一个只包含 'a' , 'b' , 'c' 三种字符的字符串的
 * 最短的、长度超过 1 的回文子串的长度是多少？
 */

import java.util.*;
public class Test11 {
        public static String longestPalindrome(String s) {
            int N = s.length();
            boolean[][] dp = new boolean[N][N];
            String res = "";

            for (int i = N - 1; i >= 0; i--) {
                for (int j = i; j < N; j++) {
                    if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])) {
                        dp[i][j] = true;
                    }
                    if (dp[i][j] && (j - i + 1) > res.length()) {
                        res = s.substring(i, j + 1);
                    }
                }
            }
            return res;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String shortestLength = longestPalindrome(input);
        if(shortestLength.length() <=1){
            System.out.println(-1);
        }else {
            System.out.println(shortestLength.length());
        }
    }
}
