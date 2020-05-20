package sort;

import utils.ArrayUtils;

/**
 *
 * @author jason
 */
public class InsertSort {

    public static void insertSort(int[] array){
        if(array==null || array.length<2){
            return;
        }
        int preIndex,current;
       for(int i=1;i<array.length;i++){
          preIndex = i - 1;
          current = array[i];
          while (preIndex >= 0 && array[preIndex] > current){

              array[preIndex + 1] = array[preIndex];
              preIndex--;
          }
          array[preIndex +1] = current;
          ArrayUtils.printArray(array);
       }
    }
}
