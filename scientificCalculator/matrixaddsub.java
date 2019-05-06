

package scientificCalculator;

public class  matrixaddsub{

    //to add two matrices
    public int[][] Matadd(int[][] matrix1, int[][] matrix2 ) {
        int r = matrix1.length;
        int c= matrix1[0].length;
        int[][] result = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            result[i][j]=matrix1[i][j]+matrix2[i][j];
            }}
        return result;
        }

     //to subtract two matices
    public int[][] Matsub(int[][] matrix1, int[][] matrix2 ) {
        int r = matrix1.length;
        int c= matrix1[0].length;
        int[][] result1 = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            result1[i][j]=matrix1[i][j]-matrix2[i][j];
            }}
        return result1;
        }
   
}
0 comments on commit 257ee39 
