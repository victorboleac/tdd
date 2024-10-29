package org.example;

public class Tasks {

    public int sumMiddleDigits(int[] arrayOfInt){
        // check if length of the array is less than 3
            // return 0
        if (arrayOfInt.length<3){
            return 0;
        }
        int max = arrayOfInt[0];
        int min =arrayOfInt[0];
        int sum = 0;
        for(int number:arrayOfInt){
            if (max>number){
                max = number;
            }
            if (min<number){
                min = number;
            }
        }
        for(int number: arrayOfInt){
            boolean b = number != min;
            if((number!=max)&&(number!=min)) {
                sum+=number;
            }
        }
        return sum;
    }

    public Double findArrayMean(Number[] values) {
        Double mean = null;
        Double sum = 0.0;
        if (values.length > 0) {
            for (Number number : values) sum += number.doubleValue();
            mean = sum / values.length;
            return mean;
        }
        return mean;
    }
    public int addingASCIICodes(String input){
        int sum = 0;
        if(input.isEmpty()){
            return 0;
        }
        char[] chArray = input.toCharArray();
        for(char ch: chArray){
            if(!Character.isLetterOrDigit(ch)) return -1;
            sum += (int) ch;
        }

        return sum;
    }
}
