class SparseMatrix {
    // Write a function that accepts an integer matrix as input and generates a line
    // of output for each non-zero value in the matrix.  Each line should have the following format:
    // [row_number, column_number]: value
    public static void convertToSparse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int value = matrix[i][j];
                if (value != 0) {
                    System.out.println("[" + i + ", " + j + "]: " + value);
                }
            }
        }
    }

    public static int[][][] generateMatrices(int n) {
        int[][][] matrices = new int[n][5][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) { 

                    // creates n matrices with ~80% zeros and the rest decimal integers
                    if (Math.random() > 0.8) {
                        matrices[i][j][k] = (int) (Math.random() * 9) + 1;
                    }
                }
            }
        }
        return matrices;
    }

    public static void main(String[] args) {
        int[][][] matrices = generateMatrices(10);
        for (int i = 0; i < matrices.length; i++) {

            // print matrix
            System.out.println("Matrix:");
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(matrices[i][j][k] + " ");
                }
                System.out.print("\n");
            }

            // print sparsed version of matrix
            System.out.println("Sparse matrix:");
            convertToSparse(matrices[i]); 
            System.out.println();
        }
    }

}