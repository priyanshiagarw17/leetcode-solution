package zigzagconversion;

public class Solution {

        public String convert(String s, int numRows) {
            if (numRows==1){
                return s;
            }
            StringBuilder[] strings=new StringBuilder[numRows];
            for(int i=0;i<numRows;i++){
                strings[i] = new StringBuilder();
            }
            int j=0;
            int d=1;
            for(int i=0;i<s.length();i++){
                strings[j].append(s.charAt(i));
                if(j==0){
                    d=1;
                }
                if(j==numRows-1){
                    d=-1;
                }
                j+=d;
            }
            StringBuilder result=new StringBuilder();
            for (StringBuilder sb:strings) {
                result.append(sb);
            }

            return result.toString();

        }

}
