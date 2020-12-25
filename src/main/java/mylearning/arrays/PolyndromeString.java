package mylearning.arrays;

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
        if((asciiCode >=48 && asciiCode<=57) || (asciiCode >=65 && asciiCode <=90)){
            return true;
        }
        return false;
    }
}
