/**
 * 假设一个球从任意高度自由落下，
 * 每次落地后反跳回原高度的一半;
 * 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
 * 示例1:
 * 输入
 * 1
 * 输出
 * 2.875
 * 0.03125
 */
import java.util.Scanner;
public class Test29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int high = in.nextInt();
            double sumHigh;
            double finalHigh;
            sumHigh = high + high/2.0*2 + high/4.0*2 + high/8.0*2 + high/16.0*2;
            finalHigh = high/32.0;
            System.out.println(sumHigh);
            System.out.println(finalHigh);
        }
    }
}