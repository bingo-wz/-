
/**
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）
 */

import java.util.*;
public class Test22 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            System.out.println(checkPassword(str)?"OK":"NG");
        }
    }
    public static Boolean checkPassword(String str){
        // 验证长度
        if(str.length() <= 8) return false;
        // 验证包括的字符种类
        int low = 0, up = 0, num = 0, other = 0;
        for(int i = 0; i < str.length(); i++){
            char tmp = str.charAt(i);
            if(tmp >= 'a' && tmp <= 'z'){
                low = 1;
            }
            else if(tmp >= 'A' && tmp <= 'Z'){
                up = 1;
            }
            else if(tmp >= '0' && tmp <= '9'){
                num = 1;
            }
            else{
                other = 1;
            }
        }
        if(low+up+num+other < 3) return false;
        // 验证是否有长度大于2的子串重复
        for(int i = 0; i < str.length(); i++){
            for(int j = i+3; j < str.length(); j++){
                String tmp = str.substring(i, j);
                if(str.substring(j).contains(tmp)){
                    return false;
                }
            }
        }
        // 以上false都没有出现，返回true
        return true;
    }
}