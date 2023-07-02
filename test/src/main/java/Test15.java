/**
 * 给定彼此独立的两棵二叉树，判断 t1 树是否有与 t2 树拓扑结构完全相同的子树。
 * 设 t1 树的边集为 E1，t2 树的边集为 E2，若 E2 等于 E1 ，则表示 t1 树和t2 树的拓扑结构完全相同。
 */
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Test15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(); // t1的总节点个数
        int root1 = scanner.nextInt(); // t1的根节点

        // 构建t1的树结构
        Map<Integer, TreeNode> map1 = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            int fa = scanner.nextInt();
            int lch = scanner.nextInt();
            int rch = scanner.nextInt();

            TreeNode parent = map1.getOrDefault(fa, new TreeNode(fa));
            TreeNode leftChild = lch != 0 ? new TreeNode(lch) : null;
            TreeNode rightChild = rch != 0 ? new TreeNode(rch) : null;

            parent.left = leftChild;
            parent.right = rightChild;

            map1.put(fa, parent);
            map1.put(lch, leftChild);
            map1.put(rch, rightChild);
        }

        int n2 = scanner.nextInt(); // t2的总节点个数
        int root2 = scanner.nextInt(); // t2的根节点

        // 构建t2的树结构
        Map<Integer, TreeNode> map2 = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            int fa = scanner.nextInt();
            int lch = scanner.nextInt();
            int rch = scanner.nextInt();

            TreeNode parent = map2.getOrDefault(fa, new TreeNode(fa));
            TreeNode leftChild = lch != 0 ? new TreeNode(lch) : null;
            TreeNode rightChild = rch != 0 ? new TreeNode(rch) : null;

            parent.left = leftChild;
            parent.right = rightChild;

            map2.put(fa, parent);
            map2.put(lch, leftChild);
            map2.put(rch, rightChild);
        }

        // 判断t1是否有与t2拓扑结构完全相同的子树
        boolean result = isSubtree(map1.get(root1), map2.get(root2));
        System.out.println(result ? "true" : "false");
    }

    // 判断两棵树是否完全相同
    private static boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }

    // 判断t1是否有与t2拓扑结构完全相同的子树
    private static boolean isSubtree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return false;
        }
        if (isSameTree(t1, t2)) {
            return true;
        }
        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }
}
