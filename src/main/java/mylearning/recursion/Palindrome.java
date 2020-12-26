package mylearning.recursion;
public class Palindrome{
	public static void main(String arg[]){
		System.out.println(isPalindrom("MadaM"));
		System.out.println(isPalindrom("abcdahdcba"));

		Integer[] arrayInteger = new Integer[10];

		int[] arrayInteger1 = new int[20];


	}

	private static boolean isPalindrom(String str){

		if(str==null || str.length() <=1){
			return true;
		}
		int length = str.length();

		if(str.charAt(0)== str.charAt(length -1)) {
			return isPalindrom(str.substring(1, length - 1));
		}
		else{
			return false;
		}
	}
}