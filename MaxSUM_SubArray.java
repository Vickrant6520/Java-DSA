// 
package tcs;

import java.util.Arrays;

public class MaxSUM_SubArray {

    public static int merge(int[] X) {
        int sum = 0;
        int max = X[0];
        for(int i =0 ; i < X.length ; i++){
            sum += X[i];
            
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
        
    }

    public static void main(String[] args) {
        int[] X = {1, -4 , -3 , 6 ,-2 , 9 , -1 , -5};
        int max = merge(X);
        System.out.println("Maximum result : " +max);
    }

}
