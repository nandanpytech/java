package Practice;

import java.util.Arrays;

public class Convertshasttostring {
    public static void main(String[] args) {
        String name="10#12#12";
        int n=name.length();
        int i=0;
       while(i<n) {
           String value = "";
           if (i<n-2&&name.charAt(i + 2) == '#') {
               value += (char) ('a' + (10 * (name.charAt(i) - '0') + (name.charAt(i + 1) - '0') - 1));
               i=i+3;
           }else{
               value+=(char)('a'+(name.charAt(i)-'0')-1);
               i++;
           }

       }



    }
}
