import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {

    private int[][] testMatrix;

    @BeforeEach
    void setUp() {
        testMatrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateAverage() {
        double average = MatrixOperations.calculateAverage(testMatrix[0]);
        assertEquals(2.0, average, 0.01);
    }

    @Test
    void isSquareMatrix() {
        assertTrue(MatrixOperations.isSquareMatrix(testMatrix));
    }
}