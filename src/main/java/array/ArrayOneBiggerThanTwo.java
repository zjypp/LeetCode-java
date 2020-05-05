package array;

/**
 * 判断数组中是否有一个数字是其他所有数字的2倍，找出来
 * 这个算法在LeetCode排名中No1，。。niu了
 */
public class ArrayOneBiggerThanTwo {

    public int dominantIndex(int[] nums) {
        if(nums==null || nums.length ==0){
            return -1;
        }
        int max = nums[0];
        int maxIndex =0;
        for (int i=1;i<nums.length;i++){
          if(max < nums[i]){
              max = nums[i];
              maxIndex = i;
          }
        }

       for(int n=0;n<nums.length;n++){
           if(max < nums[n]*2 && n !=maxIndex){
               return -1;
           }
       }
    return maxIndex;

    }
}
