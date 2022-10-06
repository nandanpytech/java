package Practice2;

public class Main {
    public static void main(String[] args) {
        MultDiv r1=new MultDiv(20,50);
        //Addition
        int ad=r1.Add();
        System.out.println(ad);

        //Substraction
        int sub=r1.sub();
        System.out.println(sub);

        //Multiplication
        int mul=r1.Mul();
        System.out.println(mul);

        //Division
        float div=r1.Div();
        System.out.println(div);
    }
}
 class AddSub {
    int num1;
    int num2;
    AddSub(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
    }
    int Add(){
        return num1+num2;
    }
    int sub(){
        return num2-num1;
    }
}
class MultDiv extends AddSub {
    public MultDiv(int n1,int n2){
        super(n1,n2);
    }
    int Mul(){
        return num1*num2;
    }
    float Div(){
        return num2/num1;
    }
    public void display(){
        System.out.println(num1);
        System.out.println(num2);
    }
}