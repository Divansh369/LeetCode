import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {public static void reverseArray(int[] arr) {
        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        Collections.reverse(list);
        Integer[] reversedArray = list.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversedArray[i];
        }
    }
    public void rotate(int[][] matrix) {
        
        int[][] clone=new int[matrix.length][matrix.length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
               clone[i][j]=matrix[matrix.length-1-j][i];
            }
        }
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
               matrix[i][j]=clone[i][j];
            }
        }
    }
}