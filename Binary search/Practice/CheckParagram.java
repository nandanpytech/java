package Practice;

public class CheckParagram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        int[] count = new int[26];
        for (char c: sentence.toCharArray())
            count[c - 'a']++;

        for (int n: count)
            if (n == 0)
                System.out.println("false");

        System.out.println("true");
    }
}
