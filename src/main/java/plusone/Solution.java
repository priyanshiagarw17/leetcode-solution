package plusone;

import java.util.ArrayList;

public class Solution {

        public int[] plusOne(int[] arr1) {
            int arr2[]={1};
            int i=arr1.length-1;
            int j=arr2.length-1;
            int carry=0;
            ArrayList<Integer> list=new ArrayList<>();
            while(i>=0&&j>=0){
                int sum = carry+arr1[i]+arr2[j];
                list.add(sum%10);
                carry=sum/10;
                i--;
                j--;
            }
            while(i>=0){
                int sum=carry+arr1[i];
                list.add(sum%10);
                carry=sum/10;
                i--;
            }
            while(j>=0){
                int sum=carry+arr2[j];
                list.add(sum%10);
                carry=sum/10;
                j--;
            }
            if(carry>0){
                list.add(carry);
            }
            int ans[]=new int[list.size()];
            // Arr = list.toArray(new Integer[list.size()]);
            int z=0;
            for(int q=list.size()-1;q>=0;q--){
                ans[z++]=list.get(q);
            }
            return ans;
        }

}
