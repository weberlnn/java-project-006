/**
 * Created by lin on 2016/8/15.
 */
public class LowCase {
    public static void main(String args[]) {
        char ch;
        for(int i=0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            ch = (char) ((int) ch | 32);
            System.out.println(ch + " ");
        }
    }
}
