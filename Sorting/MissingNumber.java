import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[]nums={1,2,0};
        int ans=Cyclic(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }
    static int Cyclic(int[]nums) {
        int i = 0;
        while (i < nums.length) {
            //It is the correct index for the value..
            int correct = nums[i]-1;
            //It doesn't check for the value 0;
            if (nums[i]>0 && nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);                        //function to swap the value...
            } else {
                i++;
            }
        }
        //Checking for the missing index in array...
        for (int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }






    static void swap(int[]nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

}
