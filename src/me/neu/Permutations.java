package me.neu;

/**
 * Created by pramod on 10/15/2016.
 */
public class Permutations {

    static void permutations(String word){
        peformPermutations("",word);
    }

    static void peformPermutations(String prefix, String subString){
        if(subString.length() == 0){
            System.out.println(prefix);
        }else{
            for(int i=0;i<subString.length();i++){
                peformPermutations(prefix + subString.charAt(i),subString.substring(0,i) + subString.substring(i+1,subString.length()));
            }
        }
    }

    public static void main(String[] args){
        permutations("abc");
    }


}
