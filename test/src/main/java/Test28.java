/**
 * 统计每个月兔子的总数
 */

import java.util.Scanner;
public class Test28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            //输入的月数
            int month = in.nextInt();

            //a表示第一个月的小兔; b表示第二个月的小兔;c表示所有可生育兔子
            int a = 1;
            int b = 0;
            int c = 0;
            for (int i = 1; i <month; i++) {
                c += b;//第二月小兔长变成熟的兔数量
                b = a;//第一个月小兔变第二个月小兔数量
                a = c;//生出小兔的数量
            }
            System.out.println(a + b + c);
        }
    }
}