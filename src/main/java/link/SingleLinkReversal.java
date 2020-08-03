package link;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Stack;

public class SingleLinkReversal {
    public   static SingleLinkPojo head ;

    public static void read(SingleLinkPojo head){
        while (head !=null){
            System.out.println(head.getValue());
            head = head.getNext();
        }
    }

    public static SingleLinkPojo build(Integer size){
        head = new SingleLinkPojo(0);

        SingleLinkPojo current = head;
        for (int i = 1; i < size; i++) {
            SingleLinkPojo tmp = new SingleLinkPojo(i);
            current.setNext(tmp);
            current = tmp;
        }
        return head;
    }

    public static SingleLinkPojo reversal(SingleLinkPojo head){
        SingleLinkPojo current =head;
        Stack stack= new Stack();
        while (current !=null){

            System.out.println(current.getValue());
            stack.push(current.getValue());
            current = current.getNext();
        }
        System.out.println("stack pop");
        Integer v  = (Integer) stack.pop();
        SingleLinkPojo singleLinkPojoR  = new SingleLinkPojo(v)  ;
        SingleLinkPojo cur = singleLinkPojoR;
        while (!stack.isEmpty()){
            Integer vv = (Integer)stack.pop();
            SingleLinkPojo dd = new SingleLinkPojo(vv);
            cur.setNext(dd);
            cur = cur.getNext();
            cur.setNext(null);

        }

        return null;
    }
}
