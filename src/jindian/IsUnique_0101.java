package jindian;

import java.util.HashSet;
import java.util.Set;

public class IsUnique_0101 {
    public boolean isUnique(String astr) {
        Set<Character> set=new HashSet<>();
        for (int i=0;i<astr.length();i++){
            if (set.contains(astr.charAt(i)))
                return false;

            set.add(astr.charAt(i));
        }
        return true;
    }
}
