package Practice;

public class UniqueNumber {
    public static void main(String[] args) {
        int n=5;
        if(n==1){
            int ar[] = {0};
            System.out.println(ar);
        }
        int arr[] = new int[n];
        if(n%2==0){
            int index=0,num=1;
            while(index!=n){
                arr[index++]=num;
                arr[index++]=-num;
                num++;
            }
        }
        else{
            int index=0,num=1;
            while(index!=n-1){
                arr[index++]=num;
                arr[index++]=-num;
                num++;
            }
            arr[index]=0;
        }
        System.out.println(arr);

    }
}
