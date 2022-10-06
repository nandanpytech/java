package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(index[i],nums[i]);
        int arr[] = new int[list.size()];
        for(int j=0;j<arr.length;j++)
            arr[j]=list.get(j);
        System.out.println(Arrays.toString(arr));
    }
}
