package mylearning.arrays;


/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

        Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

        Example 1:

        Given nums = [1,1,2],

        Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

        It doesn't matter what you leave beyond the returned length.

        Time complexity O(N)
        space Complexity O(1)
        */

public class RemoveDuplicateFromSortedArray {
    static int[] arr = {1,1,1,2,3,3,4};

    public static void main (String arg[]){

        System.out.println(removeDuplicates(arr));

        if(arr[0] == 1 && arr[1] ==2 && arr[2] == 3 && arr[3] == 4){
            System.out.println("good..");
        }else{
            System.out.println("bad...");
        }

    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 )
            return 0;
        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return ++i;
    }

}
