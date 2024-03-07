package containerwithmostwater;

public class Solution {

        public int maxArea(int[] height) {
            int r=height.length-1;
            int l=0;
            int w=0;
            while(l<r){
                int k=Math.min(height[l],height[r]);
                w=Math.max(w,k*(r-l));
                if(height[l]<height[r]){
                    l++;
                }
                else{
                    r--;
                }
            }
            return w;

        }

}
