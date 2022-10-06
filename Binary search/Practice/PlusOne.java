package Practice;

import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int n=arr.length;
        int[]ans=AddIt(arr,n);


    }

    static int[] AddIt(int[]arr,int n){
        for (int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }else{
                arr[i]=0;
            }
        }
        int [] arr2=new int[n+1];
        arr2[0]=1;
        return arr2;
    }


}
