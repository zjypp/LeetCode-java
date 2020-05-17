package sort;

public class QuickSort2 {

    public static void quickSort(int[] array,int left,int right){

        if(left > right){
            return;
        }
        int i,j,temp;
        i =left;
        j=right;
        temp = array[i];
        while (i < j){

            if(temp <= array[j] && left < right){
                j--;
            }
            if(temp >= array[i] && left < right){
                i++;
            }
            if(i < j){
                swap(array,i,j);
            }
            array[left] = array[i];
            array[i] = temp;
            print(array);
            quickSort(array,left,j-1);
            quickSort(array,j+1,right);
        }

    }

    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] =array[j];
        array[j] = temp;
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
