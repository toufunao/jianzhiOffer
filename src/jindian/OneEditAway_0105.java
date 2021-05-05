package jindian;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class OneEditAway_0105 {
    public boolean oneEditAway(String first, String second) {
        int len1=first.length();
        int len2=second.length();
        if (Math.abs(len1-len2)>1)
            return false;
        if (first.equals(second))
            return true;

        int count=0;
        int i=0,j=0;
        while (i<len1 && j<len2){
            if (first.charAt(i)==second.charAt(j)){
                i++;
                j++;
                continue;
            }
            i++;
            j++;
            count++;
            if (count>1)
                return false;
            if (len2!=len1){
                if (len1>len2)
                    j--;
                else
                    i--;
            }
        }
        return true;
    }
}
