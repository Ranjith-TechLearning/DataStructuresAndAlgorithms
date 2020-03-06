package mylearning.problems.string;

import java.util.ArrayList;
import java.util.List;

public class UniqueLetter {

    public static int uniqueLetterString(String input){
        int result = 0;
        int maxLimit = 1000000007;
        int[] first = new int[26];
        int[] second = new int[26];

        for (int i = 0, cur = 0; i < input.length(); ++i) {
            int c = input.charAt(i) - 'A';
            cur = cur + 1 + i - first[c] * 2 + second[c];
            result = (result + cur) % maxLimit;
            second[c] = first[c];
            first[c] = i + 1;
        }
        return result;
    }

    public static void main(String arg[]){
        System.out.println(UniqueLetter.uniqueLetterString("ACAX"));
        System.out.println(UniqueLetter.uniqueLetterString("CODILITY"));
    }

}
