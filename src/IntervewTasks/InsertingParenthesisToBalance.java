package IntervewTasks;

import java.util.Stack;

public class InsertingParenthesisToBalance {

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

    public static int getMin(String str){

        Stack<Character> stack = new Stack<Character>();

        for(char c: str.toCharArray()){

            if(isOpenTerm(c)){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && matches(stack.peek(), c)){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }

        }

        return stack.size();
    }

    public static void main(String[] args) {
        System.out.println(getMin("))(("));
    }

}
