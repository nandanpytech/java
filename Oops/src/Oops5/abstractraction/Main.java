package Oops5.abstractraction;

public class Main {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.carrer();

        //it gives me error bcoz we cant create object for the abstract class
        //if we create object here we can call the void carrer() method.That is not possible bcoz that method have no body
//        Parent obj=new Parent() {
//        }
    }
}
