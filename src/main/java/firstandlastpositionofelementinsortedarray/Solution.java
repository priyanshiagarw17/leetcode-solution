package firstandlastpositionofelementinsortedarray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arrLeft=-1;
        int arrRight=-1;
        int start=0;
        int end=nums.length-1;
        //for starting index
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                arrLeft=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        start=0;
        end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                arrRight=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{arrLeft,arrRight};
    }
}

