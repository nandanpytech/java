package Oops3.singleInheritance;

public class Main {
    public static void main(String[] args) {
        Boxweight obj=new Boxweight(10,20,30,40);
        System.out.println(obj.w);



        //Make it fun bcoz we can't access the property of child class by the parent class Let's try
        Box obj1=new Boxweight(10,20,30,40);
        //System.out.println(obj1.weight);                    //it is giving me error bcoz it depends upon the ref variable type

        //it giving me error bcoz we need to initialize the weight first then how can ref variable type access the weight..
//        Boxweight obj2=new Box(4,5,6);
//        System.out.println();
    }
}
