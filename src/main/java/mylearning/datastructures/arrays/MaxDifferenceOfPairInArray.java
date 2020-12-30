package mylearning.datastructures.arrays;

/*
* Find Max Difference between pair of array .
* Condition (J > I)
* */
public class MaxDifferenceOfPairInArray {

    public static void main(String arg[]){
        int[] inputArray = {2,123,10,6,48,108};
        System.out.println(getMaxDifference(inputArray));
    }
    /*
      Compare previous and current and get difference and get Max of that difference and current Max.
    * */
    private static int getMaxDifference(int[] inputArray) {
        int max = -1;
        int previousValue;
        if(inputArray == null || inputArray.length <1)
            return max;

        previousValue = inputArray[0];

        for(int index = 1; index <inputArray.length;index ++){
           if( inputArray[index]-previousValue >  max){
               max = inputArray[index]-previousValue;
           }
           previousValue = inputArray[index];

        }
        return max;

    }

}
