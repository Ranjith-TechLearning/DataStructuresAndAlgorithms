package mylearning.datastructures.arrays;

import java.util.Arrays;

public class DeleteItemFromArray {
    public static void main (String arg[]){
        int[] arr = {1,1,2};
        System.out.println(deleteItemFromArray(arr,3));
        System.out.print(Arrays.toString(arr));
    }

    public static int deleteItemFromArray(int[] nums, int val) {
        int startingPointer =0;
        for(int currentIndex=1; currentIndex<nums.length; currentIndex++){
            if(nums[startingPointer] !=nums[currentIndex]){
                startingPointer ++ ;
                nums[startingPointer] = nums[currentIndex];
            }

        }
        return startingPointer+1;

    }
}
