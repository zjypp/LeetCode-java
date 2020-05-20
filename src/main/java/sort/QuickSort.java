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
            print(array,0);
        }
        array[left] = array[i];
        array[i] = temp;
        print(array,1);
        quickSort(array,left,j-1);
        quickSort(array,j+1,right);
    }

    public static void print(int[] array,int loop){
        String x ="###:";
        if(loop > 0){
            x="***";
        }

        for (int a:array
             ) {
            x +=a+",";
        }
        System.out.println(x);
    }
}
