/*To find product of two Matrices*/

package scientificCalculator;

public class Matrixprod{

    //Function to perform matrix Multiplication.
    int[][] multiply(int[][] mat1, int[][] mat2) {
        int N = mat1[0].length;
        int[][] prod = new int [N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                prod[i][j] = 0;

                for (int k = 0; k < N; k++) {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return prod;
    }

}