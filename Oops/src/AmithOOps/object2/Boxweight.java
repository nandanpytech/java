package AmithOOps.object2;

public class Boxweight extends Box{
    double weight;

    public void greeting(){
        System.out.println("this is greet");
    }

    Boxweight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight=weight;
    }
}
