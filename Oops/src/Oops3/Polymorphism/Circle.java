package Oops3.Polymorphism;

public class Circle extends  Shapes{
    @Override                                    //it over-ride the parent class area method.condition: To override parent class should have the method name
    void area(){
        System.out.println("I am circle area");
    }
}
