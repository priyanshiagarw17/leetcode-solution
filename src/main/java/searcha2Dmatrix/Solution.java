package searcha2Dmatrix;

public class Solution {

        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix==null)
                return false;
            int m=matrix.length-1;
            int n=matrix[0].length-1;
            if(target>matrix[m][n] || target<matrix[0][0])
                return false;
            int x=0;
            int y=n;
            while(x<=m && y>=0){
                if(matrix[x][y]==target)
                    return true;
                else if(target<matrix[x][y])
                    y--;
                else
                    x++;
            }
            return false;
        }

}
