import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[]arr={4,2,3,1,2};
        int ans=Cyclic(arr);
        System.out.println(ans);
    }
    static int Cyclic(int[]nums) {            //return should be in List
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;                             //It is the correct index for the value..
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);                        //function to swap the value...
            } else {
                i++;
            }
        }
        //Checking for the missing index in array.
        for (int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return nums[index];
            }
        }
        return -1;
    }
    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
