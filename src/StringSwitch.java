/**
 * Created by lin on 2016/8/14.
 */
// 使用string来控制switch语句：
public class StringSwitch {// 使用字符串来控制一个switch语句
    public static void main(String args[]) {
        String command = "cancel";
        switch(command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command Error!");
                break;
            //cancel中包含的字符串将于case常量进行比较。当找到匹配的case常量时，
            //将会执行与该case常量对应的代码序列。
        }
    }
}
