/**
 * Created by lin on 2016/8/14.
 */
/*该程序使用了一个命令行实参用于指定人的名称然后程序在二维字符串数组中查找该名称。如果找到一个匹配，就
显示该人的号码。*/
public class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                { "Tom", "555-3322" },
                { "Mary", "555-8976" },
                { "Jon", "555-1037" },
                { "Rachel", "555-1400" }
        };
        int i;
        if(args.length != 1)
            System.out.println("Usage: java Phone <nume>");
        else{
            for(i=0; i<numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("Name not found.");
        }
    }
}
