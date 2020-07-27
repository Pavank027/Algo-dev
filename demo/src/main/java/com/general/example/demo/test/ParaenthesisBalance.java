package test;

package com.general.example.demo;
import java.util.*;
public class ParaenthesisBalance {

    static boolean areParanthesisBalanced(String expr)
    {
        int jocker = 0;
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '[') {
                stack.push(x);
                continue;
            } else if ( x == '$'){
                jocker++;
                continue;
            }

            if(x==']') {
                if(!stack.isEmpty()){
                    stack.pop();
                } else if( jocker > 0){
                    jocker--;
                } else{
                    return false;
                }
            }
        }

        if(!stack.isEmpty() && stack.size() == jocker){
            return true;
        }else {if(stack.isEmpty() && jocker == 0){
            return true;
        } else {
            return stack.isEmpty();
        }
        }
    }

    public static void main(String[] args)
    {
        String expr = "]$[";

        if (areParanthesisBalanced(expr))
            System.out.println("Paraenthesis are Balanced ");
        else
            System.out.println("Paraenthesis are not Balanced ");
    }
}