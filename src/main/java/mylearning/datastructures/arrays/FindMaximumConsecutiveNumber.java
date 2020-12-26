package mylearning.datastructures.arrays;

public class FindMaximumConsecutiveNumber {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length==0 )
            return 0;

        int maxCounter =0;
        int counter =0;
        for(int num : nums){
            if(num ==1){
                counter ++;
            }else{
                counter =0;
            }
            if(maxCounter<counter){
                maxCounter = counter;
            }
        }
        return maxCounter;
    }

    public static void main (String arg[]){
        int[] array = {1,1,0,1,1,1};
        System.out.println("Maximum is : "+ findMaxConsecutiveOnes(array));
    }
}
