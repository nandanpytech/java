public class Fibonanci {
    public static void main(String[] args) {
        int ans=fib(4);
        System.out.println(ans);
    }
    static int fib(int num){
        if (num<2){
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
}
