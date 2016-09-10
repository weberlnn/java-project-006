/**
 * Created by lin on 2016/8/14.
 */
//显示字符串数组。
public class StringArrays {
    public static void main(String args[]) {
        String strs[] = { "This", "is", "a", "test."};
        System.out.println("最初的数组: ");
        for(String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");
        // 改变一个字符串。
        strs[1] = "was";
        strs[3] = "test, too!";
        System.out.println("修改后的数组: ");
        for(String s : strs)
            System.out.print(s + " ");
    }
}
