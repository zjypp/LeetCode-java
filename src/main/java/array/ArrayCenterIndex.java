package array;

import java.util.List;

/**
 * 数组中心索引
 */
public class ArrayCenterIndex {

    public int pivotIndex(int[] array){
        if(array== null || array.length==0){
            return -1;
        }

        for (int n =0;n<array.length ;n++){

            int left =sumArrayLeft(array,n);
            int right = sumArrayRight(array,n);
            System.out.println(n+"-"+left+"-"+right);
            if(left == right){
                return n;
            }
        }
        return -1;

    }

    public int sumArrayLeft(int[] array,int index){
        if(array ==null || array.length==0){
            return 0;
        }
        int sum =0;
        if(index ==0){
            return sum;
        }
        for (int n=0;n<=index-1;n++){
            sum += array[n];
        }
        return sum;
    }
    public int sumArrayRight(int[] array,int index){
        if(array ==null || array.length==0){
            return 0;
        }
        if(index==array.length - 1){
            return 0;
        }
        int sum =0;
        for (int n=index +1;n<=array.length - 1;n++){
            sum += array[n];
        }
        return sum;
    }
}
