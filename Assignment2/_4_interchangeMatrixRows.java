import java.util.Scanner;

public class _4_interchangeMatrixRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        interchangeRows(matrix);

        System.out.println("Matrix after interchanging rows:");
        printMatrix(matrix);

        sc.close();
    }

    static void interchangeRows(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        for (int i = 0; i < numCols; i++) {
            int temp = matrix[0][i];
            matrix[0][i] = matrix[numRows - 1][i];
            matrix[numRows - 1][i] = temp;
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
