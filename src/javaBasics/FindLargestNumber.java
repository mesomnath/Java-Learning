package javaBasics;

import java.util.Arrays;

public class FindLargestNumber {
    public static void findLargestNumberFromArray(int[] arrays){
        int maxNumber = 0;
        for (int array: arrays){
            if(array > maxNumber)
                maxNumber = array;
        }
        System.out.println("Largest Number from the Array: "+ maxNumber);
    }

    public static void main(String[] args){
        int[] numbers = {1,3,4,-5,6,8,-9,10,133,35,-345,359,357};
        System.out.println("Given Array: " + Arrays.toString(numbers));
        findLargestNumberFromArray(numbers);
    }
}
