package maximumsubarray;

public class Solution {

        public int maxSubArray(int[] nums) {
            int n=nums.length;
            int max=Integer.MIN_VALUE,s=0;

            for(int i=0;i<n;i++){
                s+=nums[i];
                max=Math.max(s,max);

                if(s<0)
                    s=0;
            }

            return max;
        }

}
