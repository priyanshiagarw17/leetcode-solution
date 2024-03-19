package permutations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<Integer> ll= new ArrayList<>();
            List<List<Integer>> ans= new ArrayList<>();
            Arrays.sort(nums);
            boolean boards[] = new boolean[nums.length];
            Permutation(nums,ll,ans,boards);
            return ans;
        }
        public static void Permutation(int[] nums,List<Integer> ll,List<List<Integer>> ans,boolean[] board){
            if(ll.size()==nums.length){
                if(!ans.contains(ll))
                    ans.add(new ArrayList<>(ll));
                return;
            }
            for(int i=0;i<board.length;i++){
                if(board[i]==false){
                    board[i]=true;
                    ll.add(nums[i]);
                    Permutation(nums,ll,ans,board);
                    ll.remove(ll.size()-1);
                    board[i]=false;
                }
            }
        }
    }

