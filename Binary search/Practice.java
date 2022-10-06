import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
       int[]nums={-1,0,1,2,-1,-4};
       Arrays.sort(nums);
        List<List<Integer>> ans=finding(nums);
        System.out.println(ans);

    }
    static List<List<Integer>> finding(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
            if (i==0 || (i>0 && (nums[i]!=nums[i-1])));
                int Low=i+1;
                int high=nums.length-1;
                while(Low<high){
                   int threesum=nums[Low]+nums[high]+nums[i];
                   if (threesum>0){
                       high--;
                   }else if(threesum<0){
                       Low++;
                   }else{
                        ans.add(Arrays.asList(nums[i],nums[Low],nums[high]));
                        Low++;
                        while(nums[Low]==nums[Low+1] && Low<high){
                            Low++;
                        }
                       while(nums[high]==nums[high-1] && Low<high){
                           high--;
                       }
                       Low++;
                       high--;
                   }
                }
        }
        return ans;

    }


}
