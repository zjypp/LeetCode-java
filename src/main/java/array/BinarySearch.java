package array;

/**
 *二分查找
 */
public class BinarySearch {
    public static int find(int[] array,int x){
        if(array==null || array.length==0){
            return -1;
        }
        int low =0;
        int high = array.length;
        while (low < high){

            int mid = (low + high) / 2;
            System.out.println(low+"-"+high+"-"+mid);
            if(array[mid] == x){
                return mid;
            }
            if( x > array[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return -1;
    }
}
