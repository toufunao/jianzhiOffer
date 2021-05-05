package jindian;

public class CompressString_0106 {
    public static String compressString(String S) {
        if (S.length()==0 || S.length()==1)
            return S;
        int len=1;
        StringBuilder stringBuilder=new StringBuilder();
        char temp=S.charAt(0);
        for (int i=1;i<S.length();i++){
            if (S.charAt(i)==temp){
                len++;
                temp=S.charAt(i);
            }
            else{
                stringBuilder.append(temp+""+len);
                temp=S.charAt(i);
                len=1;
            }
            if (i==S.length()-1)
                stringBuilder.append(temp+""+len);
        }
        if (stringBuilder.toString().length()>S.length())
            return S;
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        String ans=compressString("aabcccccaa");
        System.out.println(ans);
    }
}
