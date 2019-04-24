

/* To calculate matrix raised to some power. */

// Syntax: result = object.powMat(matrix, power);
    //    result: calculated value.
    //    object: object of class MatrixPower.
    //    matrix: entered matrix.
    //    power:  power to which the matrix is to be raised.


package scientificCalculator;

public class  MatrixPower{

    // Function to perform matrix ^ power.
    public int[][] powMat(int[][] matrix, int power) {
        int N = matrix[0].length;
        int[][] result = new int[N][N];

        if(power == 0)
            return identity(N);

        else if(power == 1)
            return matrix;

        if(power % 2 == 0)
            result = powMat(multiply(matrix, matrix), power / 2);

        else
            result = multiply(powMat(multiply(matrix, matrix), power / 2), matrix);

        return result;
    }

    // Function to multiply two matrices.
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

    // Function to return identity matrix of dimension N x N.
    int[][] identity(int N) {
        int[][] I = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(i == j)
                    I[i][j] = 1;
                else
                    I[i][j] = 0;
            }
        }
        return I;
    }
}
