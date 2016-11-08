package me.neu;

import java.util.Stack;

/**
 * Created by pramod on 10/17/2016.
 */
public class ReverseString_Recursion {

    public static String reverseString(String input){
        if(input.length() == 0){
            return input;
        }else{
            return reverseString(input.substring(1,input.length())) + input.substring(0,1);
        }
    }

    public static void main(String[] args){
        String input = "hello";
        reverseString(input);
    }
}
