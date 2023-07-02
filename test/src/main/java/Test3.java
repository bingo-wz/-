/**
 * 折纸问题
 请把一张纸条竖着放在桌子上，
 然后从纸条的下边向上方对折1次，
 压出折痕后展开。此时折痕是凹下去的，
 即折痕突起的方向指向纸条的背面。
 如果从纸条的下边向上方连续对折2次，
 压出折痕后展开，此时有三条折痕，
 从上到下依次是下折痕、下折痕和上折痕。
 给定一个输入参数N，代表纸条都从下边向上方连续对折N次，
 请从上到下打印所有折痕的方向。
 [要求]
 时间复杂度为
 O(2n)，额外空间复杂度为O(1)

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> result = printFolds(N);
        for (String direction : result) {
            System.out.println(direction);
        }
    }

    private static List<String> printFolds(int N) {
        List<String> result = new ArrayList<>();
        foldPaper(N, true, result);
        return result;
    }

    private static void foldPaper(int N, boolean isDown, List<String> result) {
        if (N == 0) {
            return;
        }

        foldPaper(N - 1, true, result);
        result.add(isDown ? "down" : "up");
        foldPaper(N - 1, false, result);
    }
}
