package Oops2.Staticmethod;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long population;         //it represent the no.of object created as population

    public Human(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        this.population+=1;      //initial the value of population is 1, it will get incremented when new object is being created..
    }
}
