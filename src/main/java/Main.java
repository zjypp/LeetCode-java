import array.ArrayCenterIndex;
import array.ArrayOneBiggerThanTwo;
import array.BinarySearch;
import sort.BubbleSort;
import sort.QuickSort;
import sort.SelectSort;
import utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        int[] array ={6,1,2, 7, 9, 3, 4, 5, 10, 8};

        SelectSort.selectSort(array);
        ArrayUtils.printArray(array);
        System.out.println("======");
    }

    public static String toBinary(int num, int digits) {
        //int value = 1 << digits | num;
        String bs = Integer.toBinaryString(digits); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }
}
