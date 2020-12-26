package mylearning.datastructures.arrays;
/*
Requirement points : 
     - input is sorted

[1, 1,1,1,1,1,2,3] == > [1,2,3, does not matter the rest of the array has...]
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
        int length=0;
        if(nums == null || nums.length ==0 ){
            return length;
        }

        int pointerIndex = 0;

        for(int i= 1 ; i< nums.length ; i++){
            if(nums[pointerIndex] != nums[i]){
                pointerIndex++;
                nums[pointerIndex] = nums[i];
                length ++;
            }
        }
        return length+1;
    }

}
