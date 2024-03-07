package lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

        public List<String> letterCombinations(String digits) {
            String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
            ArrayList<String> li = new ArrayList<>();
            KeyPaid(digits,"",li,map);
            return li;
        }
        public static void KeyPaid(String ques,String ans,ArrayList<String> li,String[] map){
            if(ques.length()==0){
                if(ans!=""){
                    li.add(ans);
                }
                return;
            }
            char ch = ques.charAt(0); //2
            String press = map[ch-'0']; //abc
            for(int i=0;i<press.length();i++){
                KeyPaid(ques.substring(1),ans+press.charAt(i),li,map);
            }
        }



}
