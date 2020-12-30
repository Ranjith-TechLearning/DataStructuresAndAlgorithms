package mylearning.datastructures.arrays;

public class TrappingRainWater {

	public static void main(String arg[]) {
		System.out.println("Water dropped :  " + getTrappingWaterUnit_OnSQuare(new int[]{3, 0, 1, 2, 5}));
		System.out.println("Water dropped :  " + getTrappingWaterUnit_OnSQuare(new int[]{2, 0, 2}));
		System.out.println("Water dropped :  " + getTrappingWaterUnit_OnSQuare(new int[]{8, 0, 5, 2, 3, 6}));

		System.out.println("Water dropped :  " + getTrappingRainwater(new int[]{3, 0, 1, 2, 5}));
		System.out.println("Water dropped :  " + getTrappingRainwater(new int[]{2, 0, 2}));
		System.out.println("Water dropped :  " + getTrappingRainwater(new int[]{8, 0, 5, 2, 3, 6}));
	}

	/*
	* Get the Max
	*/
	public static int getTrappingWaterUnit_OnSQuare(int[] array){
		int totalWaterUnit = 0;

		for(int i = 1 ; i < array.length-1; i ++){

			totalWaterUnit = totalWaterUnit + (Math.min(leftMax(i, array), rightMax(i, array))) - array[i];

		}

		return totalWaterUnit;


	}
	// Iterate through from current element to begining of the array.
	private static int leftMax(int currentIndex, int[] array) {
		int leftMax = array[currentIndex];
		for(int i =currentIndex; i>=0; i--){
				leftMax = Math.max(leftMax, array[i]);
		}
		return leftMax;
	}
	private static int rightMax(int currentIndex, int[] array) {
		int rightMax = array[currentIndex];
		for(int i =currentIndex; i<array.length; i++){
			if(array[i] > rightMax){
				rightMax = Math.max(rightMax, array[i]);
			}
		}
		return rightMax;
	}

	private static int getTrappingRainwater(int[] arr){
		int totalRainWater = 0;

		// get leftMax

		int[] rightMax = new int[arr.length];
		int[] leftMax = new int[arr.length];
		leftMax[0] = arr[0];
		for(int i = 1 ; i <arr.length-1 ; i++){
			leftMax[i] = Math.max(leftMax[i-1], arr[i]);
		}

		rightMax[arr.length-1] = arr[arr.length-1];
		for(int i = arr.length-2 ; i >0  ; i--){
			rightMax[i] = Math.max(rightMax[i+1], arr[i]);
		}
		//rightMax


		//
		for(int i =1 ; i< arr.length-1 ; i++){
			totalRainWater = totalRainWater+ Math.min(rightMax[i], leftMax[i]) - arr[i];
		}
		return totalRainWater;
	}
}
