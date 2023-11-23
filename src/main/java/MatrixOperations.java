
public class MatrixOperations {

    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Масив не повинен бути порожнім або null.");
        }

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row == null || row.length != rows) {
                return false;
            }
        }

        return true;
    }
}
