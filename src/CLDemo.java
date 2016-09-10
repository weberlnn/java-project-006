/**
 * Created by lin on 2016/8/14.
 */
/*既然你了解了String类，就可以理解目前出现在每个程序中的main()中的args形参了。许多程序把它称之为命令实参
命令行实参是在命令行执行程序时，直接跟在程序名后面的信息。访问java程序中的命令实参非常简单，它们都作为字符
串存储在传递给main()的String数组中。下面的程序显示了调用它所需的全部命令行实参： */
// 显示所有命令行信息。
public class CLDemo   {
    public static void main(String args[]) {
        System.out.println("There are " + args.length + " command-line arguments.");
        System.out.println("They are: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: "+ args[i]);
    }
}
/*1：按Alt+F12进行操作：dir：查看文件夹 cd：进入到某文件夹 java：执行某个文件夹 ..上节目录   .当前目录
  2：编辑配置:修改程序参数(Program arguments)
 */