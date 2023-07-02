import java.util.*;

/**
 * 给定一个括号字符串str，
 * 返回最长的能够完全正确匹配括号字符字串的长度
 */

public class Test16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        LinkedList<Integer> s1=new LinkedList<>();
        s1.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                s1.pop();
                if(s1.isEmpty()){
                    s1.push(i);
                }
                else max=Math.max(max,i-s1.peek());
            }
            else s1.push(i);
        }
        System.out.println(max);
    }
}