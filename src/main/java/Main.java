import link.SingleLinkPojo;
import link.SingleLinkReversal;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){

        SingleLinkReversal.read(SingleLinkReversal.head);
        System.out.println("init");
        SingleLinkReversal.build(4);
        SingleLinkReversal.read(SingleLinkReversal.head);
        System.out.println("reversal");
        SingleLinkReversal.reversal(SingleLinkReversal.head);
        System.out.println("======");
    }

    public static String toBinary(int num, int digits) {
        //int value = 1 << digits | num;
        String bs = Integer.toBinaryString(digits); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }
}
