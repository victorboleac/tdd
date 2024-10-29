package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata4Test {

    @Test
    @DisplayName("findOutcome returns NEUTRAL when passed empty input")
    void testFindOutcome_passedEmpty() {
        //Arrange
        String[] input = {};
        Kata4 test = new Kata4();

        //Act
        Kata4.Outcomes result = test.findOutcome(input);

        //Assert
        assertEquals(Kata4.Outcomes.NEUTRAL, result);
    }

    @Test
    @DisplayName("findOutcome returns input when passed single input")
    void testFindOutcome_passedSingleButton() {
        //Arrange
        String[] input = {"LIKE"};
        Kata4 test = new Kata4();

        //Act
        Kata4.Outcomes result = test.findOutcome(input);

        //Assert
        assertEquals(Kata4.Outcomes.LIKE, result);
    }

    @Test
    @DisplayName("findOutcome returns appropriate response for varied inputs")
    void testFindOutcome_variedInputs() {
        //Arrange
        String[] input = {"LIKE","LIKE"};
        String[] input2 = {"DISLIKE","LIKE"};
        String[] input3 = {"LIKE","DISLIKE"};
        String[] input4 = {"DISLIKE","DISLIKE"};
        String[] input5 = {"LIKE","LIKE","LIKE","DISLIKE","DISLIKE","LIKE","DISLIKE","DISLIKE","DISLIKE"};

        Kata4 test = new Kata4();

        //Act
        Kata4.Outcomes result = test.findOutcome(input);
        Kata4.Outcomes result2 = test.findOutcome(input2);
        Kata4.Outcomes result3 = test.findOutcome(input3);
        Kata4.Outcomes result4 = test.findOutcome(input4);
        Kata4.Outcomes result5 = test.findOutcome(input5);

        //Assert
        assertAll(
                () -> assertEquals(Kata4.Outcomes.NEUTRAL, result),
                () -> assertEquals(Kata4.Outcomes.NEUTRAL, result2),
                () -> assertEquals(Kata4.Outcomes.NEUTRAL, result3),
                () -> assertEquals(Kata4.Outcomes.NEUTRAL, result4),
                () -> assertEquals(Kata4.Outcomes.DISLIKE, result5)

                );

    }
}