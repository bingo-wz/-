/**
 * 给定一个数字arr，其中只有有两个数字出现了奇数次，
 * 其它数字都出现了偶数次，按照从小到大顺序输出这两个数。
 */

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            System.out.println(judge(str));
        }
    }

    public static String judge(String str) {
        //如果空串直接返回null
        if (str.length() == 0 || str == null) {
            return null;
        }
        while (true) {
            //记录旧长度
            int old = str.length();
            str = str.replace("()", "");
            //记录新长度
            int now = str.length();
            //如果替换()全部替换成功那么直接返回YES
            if ("".equals(str)) {
                return "YES";
            }
            //如果老长度和新长度一样，那么代表没有替换成功，直接返回NO
            if (old == now) {
                return "NO";
            }
        }
    }
}