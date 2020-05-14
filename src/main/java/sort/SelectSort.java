package sort;

/**
 * @author jason
 */
public class SelectSort {

    public static void selectSort(int[] array){
        if(array.length==0){
            return;
        }
        String aa="";
        for (int x:array
        ) {
            aa +=x+",";
        }
        System.out.println(aa);

       for(int i=0;i<array.length;i++){
           int minIndex =i;
           int min = array[minIndex];
           boolean swap = false;
          for (int j=i+1;j<array.length;j++){
              if(min> array[j]){
                 min = array[j];
                 minIndex = j;
                 swap =true;
              }
          }
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(minIndex+"-"+array[minIndex]);
           if(swap){
               Swap(array,i,minIndex);
           }

           System.out.println("====");
           String bb="";
           for (int x:array
           ) {
              bb +=x+",";
           }
           System.out.println(bb);
       }

    }

    public static void Swap(int[] arryay,int i,int j){
        int temp = arryay[i];
        arryay[i]= arryay[j];
        arryay[j] = temp;

    }
}
