public class PrintABC {
    public static void main(String[] args) {
        String A2Z="";
        for (int i=0;i<26;i++){
            char c=(char)('a'+i);            //it is in character value 'a','b'
            A2Z=A2Z+c;
        }
        System.out.println(A2Z);
    }

}
