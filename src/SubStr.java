/**
 * Created by lin on 2016/8/14.
 */
/*不可变字符串绝对不是程序设计的障碍，为了完全理解其中的原因，我们使用String的另一个方法：
substring()。substring()方法返回一个包含调用字符串指定部分的新字符串。因为新String对象
是包含原字符串的子串，所以原字符串没有变化，也没有违背不变原则。使用的substring()的形式：
String substring(int startIndex,int endIndex)    这里starIndex指定索引起始点，而
endIndex指定索引结束点。下面是用于演示substring()和不可变字符串原则的程序：*/
public class SubStr {  //使用子串
    public static void main(String args[]) {
        String orgstr = "Java makes the Web move.";
        String substr = orgstr.substring(5, 18);
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
// 原字符串orgstr没有变化，substr包含子字符串。