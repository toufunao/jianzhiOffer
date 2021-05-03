package jianzhi;

import java.util.Arrays;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class ReplaceSpace_05 {
    public String replaceSpace(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==' '){
                stringBuilder.append("%20");
            }else
                stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
