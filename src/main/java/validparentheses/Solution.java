package validparentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch =='(' || ch =='{' || ch =='[')
                sta.push(ch);
            else{
                if(sta.isEmpty()){
                    return false;
                }
                if( ch == ')' && sta.peek()=='(')
                    sta.pop();
                else if( ch == '}' && sta.peek()=='{')
                    sta.pop();
                else if( ch == ']' && sta.peek()=='[')
                    sta.pop();
                else
                    return false;
            }
        }
        if(sta.isEmpty()){
            return true;
        }
        return false;
    }


}