package longestvalidparenthesis;


    class Solution {
        public int longestValidParentheses(String s) {
            int n=s.length();
            int l=0;
            for(int i=0;i<n;i++){
                int o=0;
                int c=0;
                for(int j=i;j<n;j++){

                    if(s.charAt(j)=='(')
                        o++;
                    else
                        c++;

                    if(o==c){
                        l=Math.max(l,j-i+1);
                    }
                    else if(c>o)
                        break;

                }

            }
            return l;
        }
    
}
