import array.ArrayCenterIndex;
import array.ArrayOneBiggerThanTwo;
import array.BinarySearch;
import sort.QuickSort;
import sort.QuickSort2;


public class Main {
    public static void main(String[] args){

        int[] array ={7,4,5,8,1,14,22};
        QuickSort2.quickSort(array,0,array.length-1);
        System.out.println("======");
    }

    public static String toBinary(int num, int digits) {
        //int value = 1 << digits | num;
        String bs = Integer.toBinaryString(digits); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }
}
