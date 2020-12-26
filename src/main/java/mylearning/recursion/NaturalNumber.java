package mylearning.recursion;

public class NaturalNumber{

	public static void main(String arg[]){
		System.out.println(naturalNumber(100));

	}

	private static int naturalNumber(int number){
		if(number ==0){
			return 0;
		}

		return number+naturalNumber(number-1);
	}

}