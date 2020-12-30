package mylearning.datastructures.arrays;

public class LeaderInArray {
    public static void main(String arg[]){
        int[] arr = {7, 10, 4, 10, 5, 2};
        printLeadersInArray_NSqureAppoach(arr);
        printLeaderInArray_O_N_Apporach(arr);
    }

    static void printLeadersInArray_NSqureAppoach(int[] arr){
        for(int i = 0 ; i <arr.length; i ++ ){
            boolean maxExist = true;
            for(int j = i+1 ; j < arr.length ; j ++){
                if(arr[j] >= arr[i]){
                    maxExist = false;
                    break;
                }
            }
            if(maxExist) System.out.println("   Max"+i+ "   :  " +arr[i]);
        }
    }
    /*
    * Approach from the last index and go backward to if the current index is greater than pevious max.
    * Variable 
          Max : to track the max value
          check if the current value is greater than Max then print. Otherwise dont.  
    * */
    static void printLeaderInArray_O_N_Apporach(int [] array){
        int lastLeaderOccurance = array[array.length-1];
        System.out.println(lastLeaderOccurance);
        for(int i=array.length-2; i>=0 ; i--){
            if(array[i] > lastLeaderOccurance){
                lastLeaderOccurance = array[i];
                System.out.println(lastLeaderOccurance);
            }
        }
    }
}
