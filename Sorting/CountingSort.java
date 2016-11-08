package me.neu.Sorting;

/**
 * Created by pramod on 10/28/2016.
 */
public class CountingSort {

    static int[] countSort(int[] input){
        int[] output = new int[input.length];
        int[] intermidate = new int[9];
        for(int i =0;i<input.length;i++){
            int index = input[i];
            intermidate[index]++;
        }

        for(int j=1;j<intermidate.length;j++){
            intermidate[j] += intermidate[j-1];
        }

        for(int x =0;x<input.length;x++){
            output[intermidate[input[x]] - 1] = input[x];
            --intermidate[input[x]];
        }


        return output;
    }

    public static void main(String[] args){
        int[] input = {5,1,1,8,8,2,3,3,5, 6,6,7};
        countSort(input);
    }
}
