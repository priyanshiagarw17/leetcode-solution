package palindromenumber;

public class Solution {

        public boolean isPalindrome(int x) {
            if(x<0)
                return false;
            int a=x;
            int p=0;
            while(a>0){
                int k=a%10;
                p=p*10+k;
                a/=10;
            }
            return p==x;

        }

}
