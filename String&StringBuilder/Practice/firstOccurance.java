package Practice;

public class firstOccurance {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        if(haystack.length()<needle.length()){
            System.out.println(-1);
        }
        int i=0;
        String x = "";
        int n = needle.length();
        while(i<=haystack.length()-n){
            if(haystack.charAt(i)==needle.charAt(0)){
                x=haystack.substring(i,n+i);
                if(x.equals(needle)){
                    System.out.println(i);
                }
            }
            i++;
        }
        System.out.println(-1);

    }
}
