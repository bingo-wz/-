
/**
 * 二进制插入
 */
public class Test27 {

    public int binInsert(int n, int m, int j, int i) {
        // write code here
        m = m << j;
        return n + m;
    }
}
