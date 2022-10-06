package Oops3.Multilevel_inheritance;

public class Boxweight extends Box {
    double weight;

    public Boxweight(double l, double w, double h, double weight) {
        super(l, w, h);                       //calls the constructor of box
        this.weight = weight;
    }
}
