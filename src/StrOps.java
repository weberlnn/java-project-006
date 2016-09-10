/**
 * Created by lin on 2016/8/14.
 */
// 一些字符串操作。
public class StrOps {
    public static void main(String args[]) {
        String str1 = "当谈到网络编程, Java 是 #1.";
        String str2 = new String (str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;
        System.out.println("str1的长度: " + str1.length());
        // 显示str1，一次一个char。
        for(int i=0; i < str1.length(); i++)
            // 方法 int length():获取字符的长度。
            System.out.print(str1.charAt(i));
        // 方法 char charAt(i):获取i指定的索引位置的字符。
        System.out.println();
        if(str1.equals(str2))
            System.out.println("str1等于str2");
        else
            System.out.println("str1不等于str2");
        if(str1.equals(str3))
            System.out.println("str1等于str3");
        else
            System.out.println("str1不等于str3");
        result = str1.compareTo(str3);
        // 方法int compareTo(i):如果调用字符串小于i，则返回大于0的数；如果相等，则返回0。
        if(result == 0)
            System.out.println("str1和str3是相等的");
        else if(result < 0)
            System.out.println("str小于str3");
        else
            System.out.println("str1大于str3");
        // 为str1分配一个新的字符串。
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        // 方法 int indexOf(i): 在调用字符串中查找i指定的子串。
        // 返回第一个匹配的索引，如果没有匹配项,则返回-1。
        System.out.println("Index of first occurrence of One: " + idx);
        idx = str2.lastIndexOf("One");
        // 方法 int lastIndexOf(i)：在调用字符串中查找i指定的子串。
        // 如果没有匹配项，则返回-1。
        System.out.println("Index of last occurrence of One: " + idx);
    }
}
