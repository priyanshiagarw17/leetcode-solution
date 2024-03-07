package generateparenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {

        public List<String> generateParenthesis(int n) {
            List<String> s = new ArrayList<>();
            Parenthesis(n,0,0,"",s);
            return s;
        }
        public static void Parenthesis(int n,int open,int close,String ans,List<String> a){
            if(open==n && close==n){
                a.add(ans);
                return;
            }
            if(open>n||close>open){
                return;
            }
            Parenthesis(n,open+1,close,ans+"(",a);
            Parenthesis(n,open,close+1,ans+")",a);
        }

}
