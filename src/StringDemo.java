/**
 * Created by lin on 2016/8/14.
 */
/*一旦创建了一个String对象，就可以在任何允许使用被引用字符串的地方使用它。例如，可以把
String对象作为println()的一个实参来使用。   */

public class StringDemo {
    public static void main(String args[]) {
        String str1 = new String("Java string are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
