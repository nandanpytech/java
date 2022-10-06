package Oops5.Interface;

public interface Brake {
    void brake();
    void start();

    //Should have body statement for this static interface method
    static void nandan(){
        System.out.println("nandana hii");
    }


    //we can create the method which is not to be overridden by using the keyword default..
    default void hello(){
        System.out.println("hoii");
    }
}
