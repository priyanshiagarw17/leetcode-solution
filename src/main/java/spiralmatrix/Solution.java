package spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            if (matrix == null || matrix.length == 0) {
                return result;
            }

            int r = matrix.length, c = matrix[0].length;
            int l = 0, ri = c - 1, t = 0, b = r - 1;

            while ( l <= ri && t<=b) {
                for (int i = l; i <= ri; i++) {
                    result.add(matrix[t][i]);
                }
                t++;
                for (int i = t; i <= b; i++) {
                    result.add(matrix[i][ri]);
                }
                ri--;
                if (t <= b) {
                    for (int i = ri; i >= l; i--) {
                        result.add(matrix[b][i]);
                    }
                    b--;
                }
                if (l <= ri) {
                    for (int i = b; i >= t; i--) {
                        result.add(matrix[i][l]);
                    }
                    l++;
                }
            }
            return result;
        }

}
