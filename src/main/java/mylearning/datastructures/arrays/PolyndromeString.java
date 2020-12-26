package mylearning.datastructures.arrays;

public class PolyndromeString {
    public static void main(String arg[]){
        System.out.print("isPoliindrome -> "+new PolyndromeString().isPalindrome(".,"));
    }
    public boolean isPalindrome(String s) {
        int startIndex=0;
        char[] strChars = s.toUpperCase().toCharArray();
        int endIndex = strChars.length-1;
        while(startIndex<=endIndex){
            while(startIndex < strChars.length-1 && !isAlphaNumeric(strChars[startIndex]))
                startIndex++;
            while(endIndex> 0 && !isAlphaNumeric(strChars[endIndex]))
                endIndex--;
            if( startIndex<=endIndex && strChars[startIndex]!= strChars[endIndex])
            {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char character){
        byte asciiCode = (byte)character;
        if((character >=48 && character<=57) || (character >=65 && character <=90)){
            return true;
        }
        return false;
    }
}
