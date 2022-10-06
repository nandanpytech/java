package Practice;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] S= {'N','A','N','D'};
        int start=0;
        int end=S.length-1;
        System.out.println(end);
        char temp;
        while(start<end){
            temp=S[start];
            S[start]=S[end];
            S[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(S));
    }
}
