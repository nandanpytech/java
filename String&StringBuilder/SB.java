public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<26;i++){
            char c=(char)('a'+i);            //it is in character value 'a','b'
            builder.append(c);              //it is method to add value to the builder..
        }
        System.out.println(builder.toString());           //we should use tostring method to print...
    }
}
