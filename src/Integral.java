/**
 * Created by lin on 2016/9/8.
 */
public class Integral {
    public static void main(String args[]) {
        String score [][] = {
                { "0 ：0", "Love ALL" },
                { "15 ：0", "Fifteen Love"},
                { "15 ：15", "Fifteen ALL"}
        };
        int i;
        if (args.length != 1)
            System.out.println("Usage: java Phone <name>");
        else {
            for(i=0; i<score.length; i++) {
                if(score[i][0].equals(args[0])) {
                    System.out.println(score[i][0] + ": " + score[i][1]);
                    break;
                }
            }
            if(i == score.length)
                System.out.println(" ");
        }
    }
}
