package Oops1;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car(55,65);
        Car nandan=new Car(75,49);
       // System.out.println(tesla);      //it just calls the tostring method.Give value Oops1.Car@i4938etc
       // System.out.println(tesla.horn);
        //calling methods:
        tesla.greetings();
        nandan.greetings();

        //calling changename method
        nandan.Changename(88);
      //  System.out.println(nandan.speed);

        //object for other constructor
        Car naveen=new Car(nandan);

        //calling empty constructor
        // this is how you call a constructor from another constructor
        // internally: new Oops1.Car (0,01);
        Car sanju=new Car();
        System.out.println(sanju.speed);

        //copying the objects
        //internally calling the empty constructor which is in below...
        Car one=new  Car();
        Car two=one;
        System.out.println(two.horn);

    }

}
class Car{
    int speed;
    int horn;

    //method inside the class
    void greetings(){
        //System.out.println("hello my friend"+ this.speed);
    }

    //method to change the name
    void Changename(int newspeed){
        this.speed=newspeed;
    }

    //Constructor inside the class.
    Car(int speed,int horn){
        this.speed=speed;
        this.horn=horn;
    }

    //another constructor
    Car(Car other){
        this.speed=other.speed;

        System.out.println(this.speed);
    }

    Car(){
        this(00,01);
    }

}
