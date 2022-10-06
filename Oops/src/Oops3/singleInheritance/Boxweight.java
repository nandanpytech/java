package Oops3.singleInheritance;

public class Boxweight extends Box{
    double weight;

    public Boxweight(double weight){
        this.weight=weight;
    }

    public Boxweight(double l, double w, double h, double weight) {
        super(l, w, h);                             //It get values from Boxweight object and class the related constructor of the parent class
        this.weight = weight;
    }


}
