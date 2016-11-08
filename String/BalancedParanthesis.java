package me.neu.String;

import java.util.Stack;

/**
 * Created by pramod on 10/27/2016.
 */
public class BalancedParanthesis {

    static boolean isBalanced(String input){
        char[] inputs =  input.toCharArray();
        Stack<Character> inputStack = new Stack<>();
        for(int i=0;i<inputs.length;i++){
            if(inputStack.isEmpty() && (inputs[i] == '}' || inputs[i] == ']' || inputs[i] == ')')){
                return false;
            }


            if(inputs[i] == '{' || inputs[i] == '[' || inputs[i] == '('){
                inputStack.push(inputs[i]);
            }

            if(inputs[i] == '}'){
                if(!(inputStack.pop() == '{')){
                    return false;
                }
            }else if(inputs[i] == ']'){
                if(!(inputStack.pop() == '[')){
                    return false;
                }
            }else if(inputs[i] == ')'){
                if(!(inputStack.pop() == '(')){
                    return false;
                }
            }
        }

        if(inputStack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args){
        System.out.print(isBalanced("{[[([])]]}"));
    }


}
