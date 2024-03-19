package combinationsum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> l=new ArrayList<>();
            coincomp(ans,l,candidates,target,0);
            return ans;
        }
        public void coincomp(List<List<Integer>> ans,List<Integer> l,int[] arr,int sum,int idx){
            if(sum==0){
                ans.add(new ArrayList<>(l));
                return;
            }
            for(int i=idx;i<arr.length;i++){
                if(sum>=arr[i]){
                    l.add(arr[i]);
                    coincomp(ans,l, arr , sum-arr[i],i);
                    l.remove(l.size()-1);
                }
            }
        }
    }


