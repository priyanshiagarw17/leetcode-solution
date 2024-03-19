package jumpgame2;

public class Solution {

        public int jump(int[] nums) {
            int n=nums.length-1;
            int max=0;
            int cur=0;
            int jumps = 0;
            for (int i=0;i<n;i++){
                max=Math.max(max,i + nums[i]);
                if (cur==i){
                    cur=max;
                    jumps++;
                }
                if(cur>n){
                    return jumps;
                }
            }
            return jumps;
        }
    }

