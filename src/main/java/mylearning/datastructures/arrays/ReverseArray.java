package mylearning.datastructures.arrays;

import java.util.Arrays;

/*
1. Iterate through an array from N to 1 and store them in an another Array. 
2. Iterate through an array and Swap first and last
*/
public class ReverseArray {
    public static void main(String arg[]){
        int[] inputArray = new int[]{1, 2, 3, 4, 5,6,7};

        System.out.println(Arrays.toString(reverseArray(inputArray)));
       
    }

    private static int[] reverseArray (int[] inputArray){
        int lastIndex = inputArray.length-1;
    	for(int i=0;i <= lastIndex-i; i++){
    		int temp = inputArray[i];
    		inputArray[i]= inputArray[lastIndex-i];
    		inputArray[lastIndex-i] = temp;
    	}
    	return inputArray;
    }
}
