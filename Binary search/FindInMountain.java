import java.util.HashSet;

public class FindInMountain {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,4,3,2,1};
        int target=3;
        int ascending = Binarysearch(arr, target, 0, FindpeakElement(arr));
        if (ascending!=-1){
            System.out.println(ascending);
        }
        int descending = Binarysearch2(arr, target,  FindpeakElement(arr),arr.length-1);
        System.out.println(descending);

    }
    static int FindpeakElement(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return  start;
    }
    static int Binarysearch(int[]arr,int target,int start,int end){
        while(start<=end){
            //find the middle element
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int Binarysearch2(int[]arr,int target,int start,int end){
        while(start<=end){
            //find the middle element
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
