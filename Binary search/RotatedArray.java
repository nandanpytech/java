public class RotatedArray {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,7,0,1,2};
        int target=6;
        int temp=findpivot(arr);
        if (arr[temp]==target){
            System.out.println(temp);
        }
        if (target>=arr[0]){
            System.out.println(BinarySearch(arr,target,0,temp-1));
        }else{
            System.out.println(BinarySearch(arr,target,temp+1,arr.length-1));
        }

    }
    static int findpivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            //4 case are necessary:
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return  -1;

    }
    static int BinarySearch(int[]arr,int target,int start,int end){
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
}
