package sort;

/**
 * @author jason
 */
public class QuickSort {

    public  static void quickSort(int[] array,int left,int right){

        if(left > right){
            return;
        }
        int i = left;
        int j = right;
        int  temp = array[i];
        int t;
        while (i < j ){
            while (temp<=array[j] && i < j){
                j--;
            }
            while (temp>=array[i] && i<j){
                i++;
            }
            if(i<j){
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[left] = array[i];
        array[i] = temp;
        String x="";
        for (int a:array
             ) {
            x +=a + ",";
        }
        System.out.println(x);
        quickSort(array,left,j-1);
        quickSort(array,j+1,right);
    }
}
