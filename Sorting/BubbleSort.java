import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={3,6,4,2,8,9};
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubblesort(int[]arr){

        for(int i=arr.length-1;i>=0;i--){
            boolean swaped=true;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=false;
                }
            }
            //if everythig swapped after one loop then it is break;
            if (swaped){
                break;
            }
        }
    }
}
