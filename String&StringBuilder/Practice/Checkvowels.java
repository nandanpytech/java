package Practice;

public class Checkvowels {
    public static void main(String[] args) {
       String s = "bOok";
       String first= s.substring(0,s.length()/2);
       String second=s.substring(s.length()/2,s.length());
        System.out.println( count(first)==count(second));
    }
    static int count(String s){
        int value=0;
        for(int j=0;j<s.length();j++) {
            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'||
            s.charAt(j) == 'A' || s.charAt(j) == 'E' || s.charAt(j) == 'I' || s.charAt(j) == 'O' || s.charAt(j) == 'U'){
                value++;
        }
        }
        return value;
    }
}
