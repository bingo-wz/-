import java.util.Scanner;

/**
 * 给一个数组arr，其中只有一个数出现了奇数次，
 * 其它数出现了偶数次，打印这个数。
 */
public class Test24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        int res = findOddOccurringNumber(arr);
        System.out.println(res);
    }

    public static int findOddOccurringNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
