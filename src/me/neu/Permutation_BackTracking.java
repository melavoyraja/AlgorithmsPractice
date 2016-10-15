package me.neu;

/**
 * Created by pramod on 10/15/2016.
 */
public class Permutation_BackTracking {

    static void permutate(String word, int l, int r) {
        if (l == r) {
            System.out.println(word);
        } else {
            for (int i = l; i <= r; i++) {
                word = swap(word.toCharArray(), l, i);
                permutate(word, l+1, r);
            }
        }
    }

    static String swap(char[] chars, int i, int j) {
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
        return new String(chars);
    }

    public static void main(String[] args) {
        String in = "abc";
        permutate(in,0,in.length()-1);
    }
}
