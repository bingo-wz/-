import java.util.Scanner;

/**
 * 找出字符串中第一个只出现一次的字符
 */

//通过判断一个字符在字符串中的第一个索引和最后一个索引是否相同
public class Test12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            char[] chs = str.toCharArray();
            String result = "-1";
            for(int i = 0; i < chs.length; i++){
                if(str.indexOf(chs[i]) == str.lastIndexOf(chs[i])){
                    result = chs[i] + "";
                    break;
                }
            }
            System.out.println(result);
        }
        in.close();
    }
}