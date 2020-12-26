package mylearning.datastructures.arrays;

import java.util.Arrays;

public class ReverseString {
    public static void main(String arg[]){
        char[] chars = {'h','e','l','l','o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
    public static void reverseString(char[] s) {
        for(int start=0, end=s.length-1; start<=end; start++, end--){
            char temp = s[end];
            s[end]=s[start];
            s[start]=temp;
        }
    }
}
