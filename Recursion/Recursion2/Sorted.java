package Recursion2;

public class Sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int index=0;
        System.out.println(sort(arr,index));
    }
    static boolean sort(int[]arr,int index){
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index+1);

    }
}
