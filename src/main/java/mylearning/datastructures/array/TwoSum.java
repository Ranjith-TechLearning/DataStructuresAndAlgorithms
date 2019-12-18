/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
* */
package mylearning.datastructures.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String arg[]){
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(new int[] {2, 5, 7},  12);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }
    //Brute Force Solution
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        outerLoop:
        for(int i=0 ; i < nums.length-1 ; i++ ){
            for(int inneri= i+1 ; inneri < nums.length ; inneri++){
                if((nums[i]+nums[inneri]) == target )
                {
                    result[0] = i;
                    result[1] = inneri;
                    break outerLoop;
                }
            }
        }
        return result;
    }

    public int[] twoSumUsingMap(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int completement = target - nums[i];
            if(map.containsKey(completement) && map.get(completement) !=i) {
                return new int[]{map.get(completement),i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
