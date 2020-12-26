package mylearning.datastructures.arrays;

public class ArraySorted {
	public static void main(String arg[]){
		System.out.println(isArraySorted(new int[] {4, 5, 2, 8, 9}));
	}
	private static boolean isArraySorted(int[] array){
		
		for(int i = 1 ; i < array.length; i++){
				if(!(array[i-1] <= array[i])){
					return false;
				}
		}
		return true;	
	}
}
