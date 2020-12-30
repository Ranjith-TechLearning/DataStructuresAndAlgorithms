package mylearning.datastructures.searching;

public class BinarySearch {

	public static void main(String arg[]){
		int[] array = new int[] {1, 3, 5, 7, 8,10,15, 19 };
		System.out.println(binarySearchIterativeApproach(array, 8));
		System.out.println(binarySearchRecursiveApproach(array, 0, array.length-1, 8));
	}

	private static int binarySearchIterativeApproach(int[] array,  int x) {
		int low= 0 ;
		int high = array.length-1;

		while(low<= high){
			int mid = (low+high)/2;
			if(array[mid] == x){
				return mid;
			}else if(array[mid]> x){
				high = mid-1;
			}else if(array[mid] <x){
				low = mid +1;
			}
		}
		return -1;
	}

	private static int binarySearchRecursiveApproach(int[] array, int low, int high, int x){
		if (low > high) {
			return -1;
		}
		int mid = (low+high)/2;
		if(array[mid] == x){
			return mid;
		}else if(array[mid]< x){
			return binarySearchRecursiveApproach(array, mid+1, high, x);
		}else{
			return binarySearchRecursiveApproach(array, low, mid-1, x);
		}
	}


}
