package me.neu;

/**
 * Created by pramod on 10/20/2016.
 */
public class MaxSubArraySum {

    public static int maxSubArraySum(int[] input){
        int curSum =0;
        int maxSum = 0;

        for(int i=0;i<input.length;i++){
            curSum += input[i];
            if(curSum > 0){
                if(maxSum < curSum){
                    maxSum = curSum;
                }

            }else{
                curSum = 0;
            }

        }

        return maxSum;
    }



    public static void main(String[] args){
        int[] input = {2,-9,5,1,-4,6,0,-7,8};
        System.out.println(maxSubArraySum(input));
    }
}
