import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');  //op:195 ASCII value
        System.out.println('a'+3);   //op:100
        System.out.println((char)('a'+1));  //b
        System.out.println("a"+"b"); //op:ab
        System.out.println("a"+1);   //op:a1

        //System.out.println("Nandan"+ new ArrayList<>());
        //System.out.println("Nandan"+ new Integer(56));
        //We cannot add the two integer value bcoz we must add any string character in them..
//        System.out.println(new Integer(56)+ new ArrayList<>());
       // System.out.println(new Integer(56)+" "+ new ArrayList<>());

    }
}
