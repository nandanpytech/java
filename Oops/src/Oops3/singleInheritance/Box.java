package Oops3.singleInheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        super();                         //without extending any classes ,it doesn't giving me any error bcoz every class in java are the subclass of Obj class..
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
   Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
   }

   Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
   }
}
