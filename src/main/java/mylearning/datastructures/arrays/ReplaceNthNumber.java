package mylearning.datastructures.arrays;

import java.util.Arrays;

public class ReplaceNthNumber {
    public static void main (String arg[]){
        int[] arr = {3,2,2,3};
    System.out.println(removeElement(arr,3));
    System.out.print(Arrays.toString(arr));
    }

        public static int removeElement(int[] nums, int val) {
            int startingPointer = 0;
            for(int current=0 ; current< nums.length ; current ++){
                if(nums[current] !=val){
                    int temp = nums[startingPointer];
                    nums[startingPointer] = nums[current];
                    nums[current] = temp;
                    startingPointer ++;
                }
            }
            return startingPointer;
        }

}
