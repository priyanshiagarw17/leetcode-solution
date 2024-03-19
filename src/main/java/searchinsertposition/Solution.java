package searchinsertposition;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

        public int searchInsert(int[] nums, int target) {
            ArrayList<Integer> arr=new ArrayList<>();
            for(int a:nums){
                arr.add(a);
            }
            arr.add(target);
            Collections.sort(arr);
            int k=arr.indexOf(target);
            return k;
        }

}
