package mylearning.datastructures.arrays;

import java.util.Arrays;

/**
- could be sorted or not sorted does not matter.
- [1, 2, 3, 4, 5] , 2 ==> [3, 4, 5, 1, 2]
*/
public class RotateArrayLeftByKTimes {

	public static void main(String arg[]){
		int []  inputArray= {1,2,3,4,5};
        //rotateApproach1(inputArray, 3);
        //rotateApproach2(inputArray, 9);
        rotateApproach3(inputArray, 9);
		System.out.println(Arrays.toString(inputArray));
	}

	//rotate by 1 and call it as many times we want
	static void rotateApproach1(int[] arr1, int k){

		for(int index = 0 ; index < k; index ++ ){
            rotateByOne(arr1);
		}

	}

	static void rotateByOne(int[] arr1){
		int rotator = arr1[arr1.length-1];
    
		for(int index=0; index<arr1.length ; index ++){
			int tempHolder = arr1[index];
			arr1[index] = rotator;
			rotator = tempHolder;
		}
	}
	/*
	* Create a temporary array and update it in the currentPosition + K 
	* What if K goes beyond the length => K% length;
	*/
	static void rotateApproach2(int[] arr1,  int k){

		int[] tempArray = new int[arr1.length];
		
		for(int i = 0 ; i < arr1.length; i ++){
			int calculatedIndex = (i + k)%arr1.length;
			tempArray[calculatedIndex ] = arr1[i];
		}	
		for(int i=0;i<tempArray.length; i++){
			arr1[i] = tempArray[i];
		}

	}
	/*
	* Use the technique of revers array
	* */
	static void rotateApproach3(int[] arr1, int k){
	    //[1, 2, 3, 4, 5]
        //Reverse --> [5, 4, 3, 2, 1]
        //Reverse 0, K element -> [3, 4, 5, 2,1]
        //Reverse K, length-1 -> [3, 4, 5, 1,2]
        k= k%arr1.length;
        reverse(arr1, 0, arr1.length-1);
        reverse(arr1, 0, k-1);
        reverse(arr1, k, arr1.length-1);

	}
	static void reverse(int[] arr1, int start, int end){

		while(start < end){
			int temp = arr1[start];
			arr1[start] = arr1[end];
			arr1[end] = temp;
			start++;
			end--;
		}
	}

}
