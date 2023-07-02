import java.util.*;

/**
 * 找出给定字符串中大写字符(即'A'-'Z')的个数。
 */

public class Test21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println(fun(str));
        }
    }
    //将任意非大写字母的内容替换为"",即删除,并返回结果的长度
    public static int fun(String arr){
        return arr.replaceAll("[^A-Z]*","").length();
    }
}





