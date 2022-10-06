public class Pallindrome {
    public static void main(String[] args) {
        String key="";
        boolean ans=Palindrome(key);
        System.out.println(ans);
    }
    static boolean Palindrome(String key) {
        int start = 0;
        int end = key.length()-1;
            while (start < end) {
                if (key.charAt(start) == key.charAt(end)){
                    start++;
                    end--;

                }else{
                    return false;
                }
            }
            return true;
    }
}
