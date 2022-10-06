import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[]arr={3,5,2,4,1};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
            int check=arr[i]-1;              //It is the correct index for the value
            if (arr[i]!=arr[check]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

