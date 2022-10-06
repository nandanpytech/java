package Practice;

public class PalindromNumber {
    public static void main(String[] args) {
        int n=545;
        int temp=n;
        int count=0;
        while(temp>0){
            int rem=(temp%10);
            count=rem+(10*count);
            n/=10;

        }
        if (count==n){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }

}
