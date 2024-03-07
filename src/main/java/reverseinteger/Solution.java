package reverseinteger;

public class Solution {

        public int reverse(int x) {
            int a=x;
            long r=0;
            if(x<0)
                a=-1*a;
            while(a>0){
                int k=a%10;
                r=(r*10)+k;
                a/=10;
            }
            if(r>Integer.MAX_VALUE||r<Integer.MIN_VALUE){
                return 0;
            }
            if(x<0){
                return (int)(-1*r);
            }
            return (int)r;

        }

}
