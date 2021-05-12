package jianzhi;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.Set;

public class LenghtOfLongestSubString {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int right=0;
        int max=0;
        int len=s.length();
        while (right<len){
            char c=s.charAt(right);
            right++;
            while (set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            max=Math.max(max,right-left);
        }
        return max;
    }
}
