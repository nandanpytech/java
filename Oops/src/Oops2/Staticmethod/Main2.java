package Oops2.Staticmethod;


public class Main2 {
    public static void main(String[] args) {
//        Human kunal=new Human(56,1000,"Kunal",false);
//        Human rahul=new Human(64,8000,"Rahul",true);
//        System.out.println(Human.population);

       // greeting();             //we cannot call the non-static method bcoz it depends upon object not on class..

        //to call the non-static method we need to create object first of related class.
//        Main2 obj=new Main2();
//        obj.greeting();

        //object to call fun2()
        Main2 obj=new Main2();
        obj.fun2();


    }

    void fun2(){
        greeting();                              //no need to create another object to call greeting() bcoz it access the fun2() object that was created in static main in above..
    }
    void greeting(){
        System.out.println("hello my friend");
    }

}
