package sort;

import utils.ArrayUtils;

/**
 * @author jason
 */
public class BubbleSort {

    public static void bubbleSort(int[] array){
        if(array == null || array.length < 2){
            return;
        }
        ArrayUtils.printArray(array);
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1] = t;
                }
            }
        }
        ArrayUtils.printArray(array);
    }
}
