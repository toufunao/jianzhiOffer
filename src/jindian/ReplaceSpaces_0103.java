package jindian;

public class ReplaceSpaces_0103 {
    public String replaceSpaces(String S, int length) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<length;i++){
            if (S.charAt(i)==' ')
                stringBuilder.append("%20");
            else
                stringBuilder.append(S.charAt(i));
        }
        return stringBuilder.toString();
    }
}
