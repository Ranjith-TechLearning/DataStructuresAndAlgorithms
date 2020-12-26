package mylearning.datastructures.arrays;

public class SecondLargestNumberIndexInArray {

	public static void main(String arg[]){
		int[] array = {4, 2, 6, 30, 27, 60, 35};
		System.out.println(getSecondLargestNumberIndexInArray(array));

	}

	/*
	 - Array is not sorted.
     - 
	*/
	private static int getSecondLargestNumberIndexInArray(int[] array){

		int largestIndex = 0;
		int secondLargestIndex = -1;

		for(int index = 0 ; index<array.length; index++){

			if(array[index] > array[largestIndex]){
				secondLargestIndex = largestIndex;
				largestIndex = index;
			}else if(secondLargestIndex ==-1){
					secondLargestIndex = index;
			}else if(array[secondLargestIndex] < array[index]){
					secondLargestIndex = index;
				}
			}

		return secondLargestIndex;

	}

}
