public class CeilingNumber {
    public static void main(String[] args) {
        //program to find out index of the greater or exact value given target...
        int arr[]={2,3,5,7,14,17,18};
        int target=15;
        int ans=Binarysearch(arr,target);
        System.out.println(ans);
    }
    static int Binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
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
        return start;
    }
}
