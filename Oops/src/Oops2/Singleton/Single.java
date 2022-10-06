package Oops2.Singleton;

public class Single {
    private Single(){

    }

    private static Single instance;    //why static becoz it is not depend on objects of class

    public static Single getInstance(){
        if(instance==null){
            instance=new Single();
        }
        return instance;
    }

}
