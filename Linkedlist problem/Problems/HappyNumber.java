package Problems;

public class HappyNumber {
    public static void main(String[] args) {
        int n=19;
        int slow=n;
        int fast=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow!=fast);

        if(slow==1){
            System.out.println("yes");
        }
        System.out.println("No");
    }
    static int findsquare(int s){
        int sum=0;
        while(s>0){
            int rem=s%10;
            sum+=rem*rem;
            s=s/10;
        }
        return sum;
    }

}

