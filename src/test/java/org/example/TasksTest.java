package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    @DisplayName("Test different inputs for sumMiddleDigits method")
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

    @Test
    @DisplayName("findArrayMean returns null when passed empty array")
    void testFindArrayMean_emptyArray(){
        //Arrange
        Number[] input = {};
        Tasks task = new Tasks();

        //Act
        Double result = task.findArrayMean(input);

        //Assert
        assertEquals(null,result);
    }

    @Test
    @DisplayName("findArrayMean returns single value if passed single value")
    void testFindArrayMean_singleValueArray(){
        //Arrange
        Number[] input = {1};
        Tasks task = new Tasks();

        //Act
        Double result = task.findArrayMean(input);

        //Assert
        assertEquals(1,result);
    }

    @Test
    @DisplayName("findArrayMean returns correct mean for various arrays")
    void testFindArrayMean_assortedArrays(){
        //Arrange
        Number[] input = {1, 2.0, -3, 5, -6.00};
        Number[] input2 = {0, 0, 0.00};
        Number[] input3 = {240, 120};
        Tasks task = new Tasks();

        //Act
        Double result = task.findArrayMean(input);
        Double result2 = task.findArrayMean(input2);
        Double result3 = task.findArrayMean(input3);

        //Assert
        assertAll(
                () ->         assertEquals(-0.20,result),
                () ->         assertEquals(0.00,result2),
                () ->         assertEquals(180.0,result3)
        );


    }


}