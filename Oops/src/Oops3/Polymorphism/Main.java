package Oops3.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes obj=new Shapes();
//        obj.area();

        //Overriden happens when create object of both combination
        //Here,which method will be called depends upon the object type class not on the ref variable type..
        Shapes obj2=new Circle();
        obj2.area();
    }
}
