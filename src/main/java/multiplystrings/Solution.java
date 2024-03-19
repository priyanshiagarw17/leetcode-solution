package multiplystrings;

import java.math.BigInteger;

public class Solution {


        public String multiply(String num1, String num2) {

            BigInteger x= new BigInteger(num1);
            BigInteger x1= new BigInteger(num2);
            BigInteger ans=x.multiply(x1);
            return ans+"";
        }

}
