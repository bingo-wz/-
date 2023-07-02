/**
 * 求最小公倍数
 */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int lcm = getLCM(a, b);
        System.out.println(lcm);
    }

    // 求最小公倍数
    public static int getLCM(int a, int b) {
        int gcd = getGCD(a, b); // 先求最大公约数
        return (a * b) / gcd;
    }

    // 求最大公约数（使用欧几里得算法）
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


