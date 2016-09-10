/**
 * Created by lin on 2016/8/16.
 */
public class Bubble2 {
    public static void main(String args[]) {
        int nums[] = {-10, 18, 99, 100123, 49, 287, 5623, -9, 463, -978 };
        int a, b, t;
        int size;
        size = 10;
        System.out.print("最初的数组：");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(nums[b-1] > nums[b]) {
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        System.out.print("分类的数组：");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
