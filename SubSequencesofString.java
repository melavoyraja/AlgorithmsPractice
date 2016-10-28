package me.neu;

import java.util.Arrays;

/**
 * Created by pramod on 10/15/2016.
 */
public class SubSequencesofString {

    public static void subSequence(String input) {

        char[] inputs = input.toCharArray();
        String[] subSequences = new String[(int)Math.pow(2, inputs.length) -1];
        for (int i = 1; i < Math.pow(2, inputs.length); i++) {
            String value = (String.format("%" + inputs.length + "s", Integer.toBinaryString(i))).replace(' ', '0');
            String output = "";
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(j) == '1') {
                    output += input.charAt(j);
                }
            }

            subSequences[i-1] = output;

        }
        Arrays.sort(subSequences);
        for(int i=0;i<subSequences.length;i++){
            System.out.println(subSequences[i]);
        }


    }


    public static void main(String[] args) {
        subSequence("abc");
    }
}
