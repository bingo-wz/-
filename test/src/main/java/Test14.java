import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，
 * 然后输出输入字符串中该字符的出现次数
 */

public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
            String next = in.nextLine();
            String target = in.nextLine();
            System.out.println(countOfTargetChar(next,target));

    }

    private static int countOfTargetChar(String input, String target) {
        // 将输入字符串和目标字符都转换为小写（不区分大小写）
        String lowercaseInput = input.toLowerCase();
        char lowercaseTarget = target.toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < lowercaseInput.length(); i++) {
            if (lowercaseInput.charAt(i) == lowercaseTarget) {
                count++;
            }
        }
        return count;
    }
}
