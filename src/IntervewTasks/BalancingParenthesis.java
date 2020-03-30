package IntervewTasks;

import java.util.Stack;

public class BalancingParenthesis {

    public static char[][] Tokens = {{'(',')'},{'{','}'},{'[',']'}};

    public static boolean isOpenTerm(char c){
        for(char [] elem: Tokens){
            if(elem[0] == c){
                return true;
            }
        }

        return false;
    }

    public static boolean matches(char openTerm, char closeTerm){

        for(char [] elem: Tokens){
            if(elem[0] == openTerm && elem[1] == closeTerm){
                return true;
            }
        }

        return false;
    }

    public static boolean isBalanced(String str){

        Stack<Character> stack = new Stack<Character>();

        for(char c: str.toCharArray()){

            if(isOpenTerm(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty() || !matches(stack.pop(),c)){
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()([]{})"));

    }

}