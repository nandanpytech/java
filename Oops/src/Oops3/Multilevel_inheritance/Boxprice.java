package Oops3.Multilevel_inheritance;

public class Boxprice extends Boxweight {
    double price;

    public Boxprice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);               //calls the constructor of Boxweight;
        this.price = price;
    }
}
