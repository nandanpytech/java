public class BsUsingRecursion {
    public static void main(String[] args) {
        int[]arr={1,3,4,6,78,98};
        int target=78;
        int s=0;
        int e=arr.length-1;
        int ans=seach(arr,target,s,e);
        System.out.println(ans);
    }
    static int seach(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int m=s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (target>arr[m]){
            return seach(arr,target,m+1,e);             //recursive call if target > arr[mid]
        }
        return seach(arr,target,s,m-1);                 //recursive call if target< arr[mid]
    }
}
