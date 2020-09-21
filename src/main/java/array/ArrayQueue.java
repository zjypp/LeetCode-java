package array;

/**
 * 用数组实现队列
 * @author zhangjunying
 */
public class ArrayQueue {

    public String[] items;
    public int head,tail;
    /**
     * 队列容量大小
     */
    int n;
    public ArrayQueue(int n){
        items = new String[n];
        this.n=n;
        head=0;
        tail=0;
    }

    public boolean enqueue(String item){
        if(tail == n){
            if(head==0){
                return false;
            }
            for (int i =head;i<tail;i++
                 ) {
                items[i-head]=items[i];
            }
            tail=tail-head;
            head=0;

        }

        items[tail] =item;
        tail++;
        return true;
    }

    public String dequeue(){
        if(head ==tail) return "";
        String x = items[head];
        head++;
        return x;

    }
}
