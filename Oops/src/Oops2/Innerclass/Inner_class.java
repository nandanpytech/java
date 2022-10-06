package Oops2.Innerclass;

public class Inner_class {
    //Inside  the Innerclass
    static  class Test{
        static String name;                               //Here it shows a.name="nandan" and b.name="naveen"
        public  Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test hello=new Test("nandan");
        Test hi=new Test("naveen");
        System.out.println(hello.name);
        System.out.println(hi.name);

    }
}

// Outside the Innerclass
//class Test{
//    static String name;                        //here it show both object name as same "naveen"
//    public Test(String name){
//        Test.name=name;
//    }
//}
