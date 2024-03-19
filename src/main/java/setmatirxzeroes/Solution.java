package setmatirxzeroes;

import java.util.ArrayList;

public class Solution {

        public void setZeroes(int[][] arr) {
            ArrayList<Integer> list =find0(arr);
            int a=0,b=1;
            while(a<list.size() && b<list.size()){
                for(int i=0;i<arr.length;i++){
                    int r=list.get(a);
                    int c=list.get(b);
                    for(int j=0;j<arr[0].length;j++){
                        arr[r][j]=0;
                    }
                    arr[i][c]=0;
                }
                a+=2;
                b+=2;
            }
        }
        public static ArrayList find0(int arr[][]){
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==0){
                        l.add(i);
                        l.add(j);
                    }
                }
            }
            return l;
        }

}
