package mylearning.arrays;

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



    public static void main(String arg[]) {
            int[] arr = {0,0,0};
            DuplicateZeros.duplicateZeros(arr);
            System.out.println(Arrays.toString(arr));

    }
}
