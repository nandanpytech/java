public class Minimumnumber {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int ans=MaximumNumber(arr);
        System.out.println(ans);
    }
    static int MaximumNumber(int[]arr){
        int z=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > z) {
                z = j;
            }
        }
        return z;
    }
}
