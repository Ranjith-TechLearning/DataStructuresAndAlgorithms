package mylearning.datastructures.arrays;

public class FindIndexOfLargestNumberInArray {

    public static void main(String arg[]){
    	int[] arrayValue = {3, 5, 4, 2, 20};
    	System.out.println(getIndexOfLargestNumber(arrayValue));
    }
    private static int getIndexOfLargestNumber(int[] arrayValue){
    	int maxIndex= 0;
    	int maxValue = -1;
    	for(int index=0 ; index<arrayValue.length ; index++){
    		
			if(arrayValue[index] > arrayValue[maxIndex]){

				maxIndex = index;
			}
    	}
        return maxIndex;
    }
}
