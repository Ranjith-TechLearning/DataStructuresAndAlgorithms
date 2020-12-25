package mylearning.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeSortedArray {

    public static void main(String[] arg){
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        MergeSortedArray.merge(arr1,3,arr2,3);

        int[] arr= {9,9};
        System.out.print(Arrays.toString(MergeSortedArray.plusOne(arr)));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0 ; i< n; i++){
            nums1[m+i] = nums2[i];
        }
        System.out.print(Arrays.toString(nums1));
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        Queue<String> queue = new PriorityQueue<>();

    }


    public static int[] plusOne(int[] digits) {

        int carryOver = 1;
        for(int index=digits.length-1; index>=0; index--){
            if(digits[index]+carryOver <10){
                digits[index] = digits[index]+carryOver;
                carryOver=0;
                break;
            }else{
                digits[index] = (digits[index]+carryOver) %10;
                carryOver = 1;
            }
        }
        if(carryOver==1){
            int[] newArray = Arrays.copyOfRange( digits,0,digits.length+1);
            newArray[0]=carryOver;
            return newArray;

        }else{
            return digits;
        }
    }
}
