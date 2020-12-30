package mylearning.datastructures.arrays;

public class StockBuySell {

	public static void main(String arg[]){
		int[] inputSet1 = {1,5,3,8,12};
		int[] inputSet2 = {30, 20, 10};
		int[] inputSet3 = {10,20,30};
		int[] inputSet4 = {1,5,3,1,2,8};
        System.out.println(getTotalProfit_O1(inputSet1));
        System.out.println(getTotalProfit_O1(inputSet2));
        System.out.println(getTotalProfit_O1(inputSet3));
        System.out.println(getTotalProfit_O1(inputSet4));

        System.out.println( " --------------------");

        System.out.println(getMaxProfit_o1Approach(inputSet1));
        System.out.println(getMaxProfit_o1Approach(inputSet2));
        System.out.println(getMaxProfit_o1Approach(inputSet3));
        System.out.println(getMaxProfit_o1Approach(inputSet4));
	}

	/*
	Iterate the array starting from 0 and compare it with next element in the inner loop
	 and continue the inner loop until J is greater than i
	*/
	private static int getTotalProfit_O1(int[] inputArray){
      int totalProfit = 0;
      for(int i =1 ;i < inputArray.length; i++){
          if(inputArray[i] > inputArray[i-1]){
              totalProfit = totalProfit + (inputArray[i]-inputArray[i-1]);
          }
      }
      return totalProfit;
	}
    private static long getMaxProfit_o1Approach(int[] inputArray){
        long profit = 0;
        long maxProfit = 0;
        for(int i =1 ;i < inputArray.length; i++){
            if(inputArray[i] > inputArray[i-1]){
                profit = profit + (inputArray[i]-inputArray[i-1]);
            }else{
                maxProfit = Math.max(maxProfit, profit);
                profit = 0;
            }
        }
        return Math.max(maxProfit, profit);
    }
}
