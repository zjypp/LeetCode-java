import array.ArrayCenterIndex;
import array.ArrayOneBiggerThanTwo;
import array.BinarySearch;
import sort.SelectSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        int[] array ={7,4,5,8,2,34,44,66,77,88,25,12,47,62,14,45,31,84,100};

        SelectSort.selectSort(array);
        System.out.println("======");
    }

    public static String toBinary(int num, int digits) {
        //int value = 1 << digits | num;
        String bs = Integer.toBinaryString(digits); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }
}
