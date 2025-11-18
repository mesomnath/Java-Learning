package javaBasics;

import java.util.Arrays;

public class FindSecondLargestNumber {

    public static void findSecondLargestNumberFromArray(int[] arrays){
        int secondMaxNumber = 0;
        for(int i = 0; i < arrays.length; i++){
            for (int j=0; j<i; j++){
                if(arrays[i] < arrays[j]){
                    secondMaxNumber = arrays[i];
                    arrays[i]= arrays[j];
                }
            }
        }
        System.out.println("2nd Largest Number from the Array: "+ secondMaxNumber);
    }

    public static void main(String[] args){
        int[] numbers = {1,3,4,-5,6,8,-9,10,133,35,-345,359,357};
        System.out.println("Given Array: " + Arrays.toString(numbers));
        findSecondLargestNumberFromArray(numbers);
    }
}
