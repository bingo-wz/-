/**
 * 将单向链表按某值划分为左边小，中间相等，右边大的形式
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Test7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().trim().split(" ");
        int n = Integer.parseInt(params[0]);
        int pivot = Integer.parseInt(params[1]);
        String[] strList = br.readLine().trim().split(" ");
        ListNode head = new ListNode(Integer.parseInt(strList[0]));
        ListNode cur = head;
        for(int i = 1; i < n; i++){
            cur.next = new ListNode(Integer.parseInt(strList[i]));
            cur = cur.next;
        }
        head = partition(head, pivot);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static ListNode partition(ListNode node, int target) {
        ListNode less = new ListNode(-1);
        ListNode equal = new ListNode(-1);
        ListNode great = new ListNode(-1);
        ListNode lessHead = less;
        ListNode equalHead = equal;
        ListNode greatHead = great;

        while (node != null) {
            if (node.val < target) {
                less.next = node;
                less = less.next;
            } else if (node.val > target) {
                great.next = node;
                great = great.next;
            } else {
                equal.next = node;
                equal = equal.next;
            }
            node = node.next;
        }

        great.next = null;
        equal.next = greatHead.next;
        less.next = equalHead.next;

        return lessHead.next;
    }
}