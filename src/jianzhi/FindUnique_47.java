package jianzhi;

import java.util.HashMap;
import java.util.Map;

public class FindUnique_47 {
    public char firstUniqChar(String s) {
        if(s==null)
            return ' ';
        int len=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < len; i++) {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int i=0;i<len;i++){
            if (map.get(s.charAt(i))==1)
                return s.charAt(i);
        }
        return '0';
    }
}
