import array.ArrayCenterIndex;
import array.ArrayOneBiggerThanTwo;
import array.BinarySearch;
import sort.QuickSort;
import sort.SelectSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        int[] array ={7,4,5,8,1,14,22};
        String x="";
        for (int a:array
        ) {
            x +=a + ",";
        }
        System.out.println(x);
        QuickSort.quickSort(array,0,array.length-1);
        System.out.println("======");
    }

    public static String toBinary(int num, int digits) {
        //int value = 1 << digits | num;
        String bs = Integer.toBinaryString(digits); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }
}
