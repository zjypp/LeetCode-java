import array.ArrayCenterIndex;
import array.ArrayOneBiggerThanTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int[] x = {1,6,1,3};

        ArrayOneBiggerThanTwo arrayOneBiggerThanTwo = new ArrayOneBiggerThanTwo();
        int a = arrayOneBiggerThanTwo.dominantIndex(x);

        System.out.println(a);
        System.out.println("======");
    }
}
