package jindian;

/**
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 */
public class IsFlipedString_0109 {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length()!=s2.length())
            return false;

        String temp=s2+s2;

        return temp.contains(temp);
    }
}
