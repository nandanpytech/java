package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candies= {4,2,1,1,2};
        int extraCandies = 1;
        List arr = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int ans=candies[i]+extraCandies;
            int ans1=0;
            for(int j=i+1;j<candies.length;j++){
                ans1= Math.max(ans1,Math.max(ans,candies[j]));
            }
            if (ans==ans1){
                arr.add(true);
            }else{
                arr.add(false);
            }
        }
        System.out.println(arr);

    }
}
