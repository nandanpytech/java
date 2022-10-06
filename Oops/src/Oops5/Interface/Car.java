package Oops5.Interface;

public class Car implements Engine,Brake {
    int a=10;


    @Override
    public void brake() {
        System.out.println("I am brake");
    }

    @Override
    public void start() {
        System.out.println("I am start");
    }

    @Override
    public void stop() {
        System.out.println("I am stop");
    }

    static void nandan(){
        System.out.println("hii");
    }


}
