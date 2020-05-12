import array.ArrayCenterIndex;
import array.ArrayOneBiggerThanTwo;
import array.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        int[] array ={3,4,7,8,34,44,66,77,88};
        int x = BinarySearch.find(array,44);
        System.out.println(x);
        System.out.println("======");
    }

    public static String toBinary(int num, int digits) {
        //int value = 1 << digits | num;
        String bs = Integer.toBinaryString(digits); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }
}
