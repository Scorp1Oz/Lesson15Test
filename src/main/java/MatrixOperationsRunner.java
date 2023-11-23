
public class MatrixOperationsRunner {

    public static void main(String[] args) {
        int[][] exampleMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        if (MatrixOperations.isSquareMatrix(exampleMatrix)) {
            System.out.println("Матриця є квадратною.");
        } else {
            System.out.println("Матриця не є квадратною.");
        }

        double average = MatrixOperations.calculateAverage(exampleMatrix[0]);
        System.out.println("Середнє арифметичне першого рядка матриці: " + average);
    }
}
