package Oops5.Interface;

//Variables in Interfaces are final and static we can't change those bcoz not depend upon objects

public class Main {
    public static void main(String[] args) {
        Car obj=new Car();
        //Even if both Engine and Brake have the start() method it override the anyone of the method.
        //That's not matter here bcoz Car has its own overriden method start() and body of that method..
        obj.start();

        //We can't use below one if object to be type: Engine obj=new Car()
        System.out.println(obj.a);



    }
}
