package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    @DisplayName("Test different in puts for sumMiddleDigits method")
    void testSumMiddleDigits_withDifferentInputs() {
        // Arrange
        int[] firstArray = {5, 2, 6, 10, 22};
        int[] secondArray = {1,2,3,4,5};
        int[] thirdArray = {1};
        int[] fourthArray = new int[0];
        int[] fifthArray = {1,2};
        int[] sixthArray = {1,2,3};
        // Act
        Tasks task1 = new Tasks();
        int firstSum = task1.sumMiddleDigits(firstArray);
        int secondSum = task1.sumMiddleDigits(secondArray);
        int thirdSum = task1.sumMiddleDigits(thirdArray);
        int fourthSum = task1.sumMiddleDigits(fourthArray);
        int fifthSum = task1.sumMiddleDigits(fifthArray);
        int sixthSum = task1.sumMiddleDigits(sixthArray);
        // Assert
        assertAll(
                () -> assertEquals(21, firstSum),
                () -> assertEquals(9, secondSum),
                () -> assertEquals(0, thirdSum),
                () -> assertEquals(0, fourthSum),
                () -> assertEquals(0,fifthSum),
                () -> assertEquals(2, sixthSum)
        );

    }
}