package sort;

/**
 * @author jason
 */
public class QuickSort {

    public  static void quickSort(int[] array,int left,int right){

        print(array);
        if(left > right){
            return;
        }
        int i = left;
        int j = right;
        int  temp = array[i];
        int t;
        while (i < j ){
            while (temp<=array[j] && left < right){
                j--;
            }
            while (temp>=array[i] && left<right){
                i++;
            }
            if(i<j){
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
            array[left] = array[i];
            array[i] = temp;
            print(array);

            quickSort(array,left,j-1);
            quickSort(array,j+1,right);
        }

    }

    public static void print(int[] array){
        String x="";
        for (int a:array
             ) {
            x +=a+",";
        }
        System.out.println(x);
    }
}
