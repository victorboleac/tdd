package org.example;

import java.util.Arrays;

public class Kata5 {

    public String caesarCipher(int step, String input){
        if(input.isEmpty()){
            return "";
        }

        // to loop through each character
        char[] cArray = input.toCharArray();
        for(int i = 0; i<cArray.length; i++){
            // check if it is a letter
            if (Character.isLetter(cArray[i])){
                if(Character.toLowerCase(cArray[i])-97+step<26){
                    cArray[i] = (char) (cArray[i] + step);
                }else{
                    cArray[i]+= (char) (step - 26);
                }
            }
            }
        return String.valueOf(cArray);
    }
}
