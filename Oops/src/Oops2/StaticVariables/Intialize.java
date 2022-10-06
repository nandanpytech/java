package Oops2.StaticVariables;

public class Intialize {
   static int a=4;             //it should be static when we used this variable inside the static block
    static  int b=5;

    //static block : it executed only once when first object being created.
    static {
        b=a*5;
    }

    public static void main(String[] args) {
        Intialize newone = new Intialize();
        System.out.println(Intialize.b);

        Intialize two=new Intialize();
        System.out.println(Intialize.b);
    }
}
