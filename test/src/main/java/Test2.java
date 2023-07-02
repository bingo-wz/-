import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Test2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，
     * 直接返回方法规定的值即可
     *
     * @param root TreeNode类 the root
     * @return int整型一维数组
     */
    public int[] findError(TreeNode root) {
        int[] result = new int[2];
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev != null && prev.val > curr.val) {
                result[0] = curr.val;
                if (result[1] == 0) {
                    result[1] = prev.val;
                } else {
                    break;
                }
            }
            prev = curr;
            curr = curr.right;
        }
        return result;
    }
}
