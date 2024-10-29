package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata6Test {

    @Test
    @DisplayName("willCheese returns empty string when passed empty race")
    void willCheese_emptyRace() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("",0,0);

        //Assert
        assertEquals("", result);
    }

    @Test
    @DisplayName("willCheese returns empty string when both speeds are 0")
    void willCheese_zeroBothSpeeds() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("---K-----M---C--",0,0);

        //Assert
        assertEquals("", result);
    }

    @Test
    @DisplayName("willCheese returns No cheese when only mouseSpeed is 0")
    void willCheese_zeroMouseSpeed() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("---K-----M---C--",1,0);

        //Assert
        assertEquals("No cheese", result);
    }

    @Test
    @DisplayName("willCheese returns Cheese when only cat speed is 0")
    void willCheese_zeroCatSpeed() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("---K-----M---C--",0,1);

        //Assert
        assertEquals("Cheese", result);
    }


    @Test
    @DisplayName("willCheese returns No cheese if cat reaches mouse first")
    void willCheese_catFirst() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("---K-----M---C--",3,1);

        //Assert
        assertEquals("No cheese", result);
    }

    @Test
    @DisplayName("willCheese returns Cheese if mouse reaches cheese first")
    void willCheese_mouseFirst() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("---K-----M---C--",1,1);

        //Assert
        assertEquals("Cheese", result);
    }

    @Test
    @DisplayName("willCheese returns Cheese party! if mouse and cat reach cheese together")
    void willCheese_sameTime() {
        //Arrange
        Kata6 test = new Kata6();

        //Act
        String result = test.willCheese("---K---M---C--",2,1);

        //Assert
        assertEquals("Cheese party!", result);
    }

}