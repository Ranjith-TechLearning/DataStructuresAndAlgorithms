package mylearning.datastructures.arrays;

import java.util.Arrays;

public class DuplicateZeros {


    public static void duplicateZeros(int[] arr) {
        int[] copyArray = arr.clone();

        int positionCounter = 0;

        for(int i=0; i< copyArray.length; i++){

            if(i+positionCounter <copyArray.length)
                arr[i+positionCounter] = copyArray[i];

            if(copyArray[i] ==0 && i+positionCounter+1< copyArray.length){
                positionCounter ++;
                arr[i+positionCounter] = 0;
            }

        }
    }

        /*
         - Move All zeros to the end..
         - Not sorted....

         - [0, 3, 4, 0, 5, 2, 0, 1] = > [3, 4, 5, 2, 1, 0, 0 ,0]
        **/

    public static void moveDuplicateZerosToEnd(int[] inputArray){
        int pointerIndex =0;

        for(int i =0; i<inputArray.length;i++){
            if(inputArray[i]!=0 ){
                int temp = inputArray[pointerIndex] ;
                inputArray[pointerIndex] = inputArray[i] ;
                inputArray[i] = temp;
                pointerIndex++;
            }
        }

    }

    public static void main(String arg[]) {
        int[] arr = {0,0,0};
        DuplicateZeros.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));

        int[] array = new int[] {0, 3, 4, 0, 5, 2, 0, 1};
        moveDuplicateZerosToEnd(array);
        System.out.println(Arrays.toString(array));

    }
}
