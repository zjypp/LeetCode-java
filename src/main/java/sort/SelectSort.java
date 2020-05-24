package sort;

import utils.ArrayUtils;

import java.lang.reflect.Array;

/**
 * @author jason
 */
public class SelectSort {

    public static void selectSort(int[] array){
        if(array.length==0){
            return;
        }
        ArrayUtils.printArray(array);

        int len = array.length;
        int minIndex, temp;
        for(int i = 0; i < len - 1; i++) {
            minIndex = i;
            for(int j = i + 1; j < len; j++) {
                if(array[j] < array[minIndex]) {     // 寻找最小的数
                    minIndex = j;                 // 将最小数的索引保存
                }
            }
            temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
            ArrayUtils.printArray(array);
        }
        ArrayUtils.printArray(array);


    }

    public static void Swap(int[] arryay,int i,int j){
        int temp = arryay[i];
        arryay[i]= arryay[j];
        arryay[j] = temp;

    }
}
