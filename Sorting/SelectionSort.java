import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr={2,4,6,1,9};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;            // it always decrement by one bcoz every time largest value move to last.
            //program to get the maximum index in array
            int temp=getMaxIndex(arr,0,last);
            swap(arr,temp,last);                 //It just swap the position of largest item in array and  last position.
        }
    }
    static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    static int getMaxIndex(int[]arr,int start,int last){
        int index=start;
        for (int i=start;i<=last;i++){
            if(arr[i]>arr[index]){               //highest value initial be the starting point that is arr[0]
                index=i;
            }
        }
        return index;
    }
}
