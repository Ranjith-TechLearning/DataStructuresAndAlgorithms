package mylearning.datastructures.arrays;

public class MaxConsicutiveOnesInArray {

    public static void main(String arg[]){
        System.out.println(String.format("Max Ones : %d", getMaxConsicutiveOnes(new int[]{1, 0, 1,1,1,1, 0, 1,1,1,})));
    }
    /*
    * Have a counter variable initialize with 0,
    * Iterate through the array starting 0
    *    - Whenever if current value is 1 then increment the counter
    *    - else
    *        assign the counter to MaxOneCount and reset the counter to 0
    * */
    public static int getMaxConsicutiveOnes(int[] arr){
        int maxOneCount = 0;
        int counter = 0 ;
             for(int currentIndex = 0; currentIndex < arr.length; currentIndex ++  ){
                 if(arr[currentIndex] == 1 ){
                     counter ++;
                 }else{
                     maxOneCount = Math.max(counter, maxOneCount);
                     counter = 0;
                 }
             }
        return maxOneCount;
    }
}
