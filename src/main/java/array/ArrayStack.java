package array;

/**
 * 用数组实现一个栈
 * @author zhangjunying
 */
public class ArrayStack {

    public String[] items;
    /**
     * 栈中元素数量
     */
    private int count;
    /**
     * 栈的大小
     */
    private int n;


    public  ArrayStack(int n){
        items = new String[n];
        this.n=n;
        this.count=0;
    }
    public boolean push(String item){
        if(count ==n)return false;
        items[count] =item;
        count++;
        return true;
    }

    public String pop(){
        if(count==0)return "";

        String temp = items[count-1];
        count--;
        return temp;
    }

}
