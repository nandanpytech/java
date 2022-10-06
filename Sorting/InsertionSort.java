import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr={1,4,3,2,6};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[]arr){
        for (int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){               //It checks in the reverse order and everything sorted then it breaks and start new loop for i...
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
