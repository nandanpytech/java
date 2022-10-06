package Practice;

public class HighFrequencyNumber {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        int temp=nums[0] , count=1;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]==temp){
                count++;
            }else{
                count --;
                if (count==0){
                    temp=nums[i];
                    count=1;
                }
            }
        }
        System.out.println(temp);
    }

}
