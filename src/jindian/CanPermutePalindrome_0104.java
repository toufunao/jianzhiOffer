package jindian;

import java.util.HashSet;
import java.util.Set;

public class CanPermutePalindrome_0104 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set= new HashSet<>();
        for (int i=0;i<s.length();i++){
            if (set.contains(s.charAt(i)))
                set.remove(s.charAt(i));
            else
                set.add(s.charAt(i));
        }
        return set.size()<=1;
    }
}
