package lengthoflastword;

public class Solution {

        public int lengthOfLastWord(String s) {
            String str[] = s.split(" ");
            String len = str[str.length - 1];
            int num = len.length();
            return num;
        }

}
