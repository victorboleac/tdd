package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata5Test {
    @Test
    @DisplayName("Testing the method with a empty string and default step (ROT13)")
    void testCaesarCipher_withEmptyStringAndDefaultStep13(){
        //Arrange
        String input ="";
        int step = 13;
        Kata5 test = new Kata5();
        //Act
        String result = test.caesarCipher(step, input);
        //Assert
        assertEquals("", result);
    }
    @Test
    @DisplayName("Testing the method with string 'a' and default step (ROT13)")
    void testCaesarCipher_withSingleCharacterAndDefaultStep13(){
        //Arrange
        String input ="a";
        int step = 13;
        Kata5 test = new Kata5();
        //Act
        String result = test.caesarCipher(step, input);
        //Assert
        assertEquals("n", result);
    }
    @Test
    @DisplayName("Testing the method with string 'A' and default step (ROT13)")
    void testCaesarCipher_withOneUppercasedCharacterAndDefaultStep13(){
        //Arrange
        String input ="A";
        int step = 13;
        Kata5 test = new Kata5();
        //Act
        String result = test.caesarCipher(step, input);
        //Assert
        assertEquals("N", result);
    }
    @Test
    @DisplayName("Testing the method with string 'n' and 'N' and default step (ROT13)")
    void testCaesarCipher_withnAndNAndDefaultStep13(){
        //Arrange
        String input ="N";
        String input2 = "n";
        int step = 13;
        Kata5 test = new Kata5();
        //Act
        String result = test.caesarCipher(step, input);
        String result1 =  test.caesarCipher(step, input2);
        //Assert
        assertEquals("A", result);
        assertEquals("a", result1);
    }
    @Test
    @DisplayName("Testing the method with a complex string default step (ROT13)")
    void testCaesarCipher_withAComplexStringAndDefaultStep13(){
        //Arrange
        String input ="I'm sure glad nobody can read my secret ROT13 code.";
        int step = 13;
        Kata5 test = new Kata5();
        //Act
        String result = test.caesarCipher(step, input);
        //Assert
        assertEquals("V'z fher tynq abobql pna ernq zl frperg EBG13 pbqr.", result);
    }

}