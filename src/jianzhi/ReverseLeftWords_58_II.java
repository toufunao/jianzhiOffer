package jianzhi;

public class ReverseLeftWords_58_II {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<s.length();i++){
            stringBuilder.append(s.charAt((i+n)%s.length()));
        }
        return stringBuilder.toString();
    }
}
