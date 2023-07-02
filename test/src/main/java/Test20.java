import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            String s1 = in.next();
            String s2 = in.next();

            int cursor1 = -1;   // 记录字符串 s1 的位置
            int cursor2 = -1; // 记录字符串 s2 的位置
            int result = -1;// 存储最小差值，默认为 -1

            for (int i = 0; i < n; ++i) {
                String s = in.next();

                if (s1.equals(s)) {
                    cursor1 = i;
                    if (cursor2 != -1) {
                        int currentDiff = cursor1 - cursor2;
                        if (result == -1 || currentDiff < result) {
                            result = currentDiff;
                        }
                    }
                }
                if (s.equals(s2)) {
                    cursor2 = i;
                    if (cursor1 != -1) {
                        int currentDiff = cursor2 - cursor1;
                        if (result == -1 || currentDiff < result) {
                            result = currentDiff;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
