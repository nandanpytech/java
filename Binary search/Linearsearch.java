public class Linearsearch {
    public static void main(String[] args) {
        int[] arr ={1, 2, 55, 14, 56};
        int target = 55;
        int ans = linerasearch(arr, target);
        System.out.println(ans);
    }

    static int linerasearch(int[] arr, int target) {
        //length of the arry is zero:
        if (arr.length==0){
            return -1;
        }
        //Iterate over the every item in the array:
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        //below execute if target not found:
        return -1;
    }

}