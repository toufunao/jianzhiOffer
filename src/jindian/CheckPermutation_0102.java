package jindian;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckPermutation_0102 {
    public boolean CheckPermutation(String s1, String s2) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for (int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']+=1;
        }
        for (int i=0;i<s2.length();i++){
            arr2[s2.charAt(i)-'a']+=1;
        }
        for (int i=0;i<26;i++){
            if (arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
