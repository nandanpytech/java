package JavaInterview;

import java.util.Scanner;

public class JAAV {
    int value=8;
    public static void main(String[] args) {

        JAAV2 one=new JAAV2(5);
        one.PrintNum();
    }
}
 class JAAV2 extends JAAV{
    int value;
    JAAV2(int value){
        this.value=value;
    }
    void PrintNum(){
        System.out.println(super.value);
    }
    Scanner an=new Scanner(System.in);
    int a= an.nextInt();
}
