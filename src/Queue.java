/**
 * Created by lin on 2016/8/11.
 */
/*这里使用数组来实现队列。数组提供了入队各项的存储空间。通过两个索引可以访问该数组。put索引指定
下一个存储数据元素的位置。get索引指定下一个获取数据元素的位置。切记，get操作是消耗型的，同一个元素
不可能检索两次。尽管我们创建的队列是用于存储字符的，但是其中的逻辑方法也适用于存储其他任何类的对象。*/
public class Queue {
    char q[];
    int putloc, getloc;
    // Queue类的构造函数创建了一个已知大小的队列。Queue构造函数如下：
    Queue(int size) {         // 创建的队列大小比size中指定的要大1。由于按照队列算法的实
        q = new char[size+1]; // 现方式，有一个数组位置是不会使用的，所以必须创建一个比所
        putloc = getloc = 0;  // 需要队列大小大1的数组。程序把put和get索引都初始化为0。
    }
    // 存储元素的put()方法
    void put(char ch) { // 把一个角色深入到队列
        if (putloc==q.length-1){
            System.out.println(" - 队列已满.");
            return;        // 该方法从检查队列是否为满的条件开始。如果putloc等于数组q中
        }                  // 的最后一个位置，那么就没有更多的位置来存储元素。否则，递增
        putloc++;          // putloc，让新的元素存储在递增后的位置上。因此，putloc总是
        q[putloc] = ch;    // 存储到最后一个元素的索引。
    }
    // 检索元素应该使用get()方法
    char get() {   // 从队列中得到一个角色
        if (getloc == putloc) {
            System.out.println(" - 队列是空的.");
            return (char) 0;   // 首先注意检查队列是否为空。如果getloc和putloc都索引同一
        }                      // 个元素，则队列为空。这就是Queue构造函数把getloc和putloc
        getloc++;              // 都初始化为0的原因。接着getloc递增，并返回下一个元素。因此
        return q[getloc];      // getloc总是表示最后一个被检索的位置。
    }
}         //显示队列类。
class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(3);
        char ch;
        int i;
        System.out.println("使用bigQ存储字母表.");
        // 把一些数字放进bigQ。
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        System.out.print("bigQ内容: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("使用smallQ生成错误.");
        // 现在，使用smllQ产生一些错误。
        for(i=0; i < 5; i++){
            System.out.println("试图储存 " + (char) ('Z' - i ));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        // 更多的错误smallQ
        System.out.print("smallQ内容: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
