public class MaxWealthinBank {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3},
                {32,1,2,3}
        };
        int ans=MaxWealth(arr);
        System.out.println(ans);
    }
    static int MaxWealth(int[][]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int count_2=0;
            for(int j=0;j<arr[i].length;j++){
                count_2=count_2+arr[i][j];
            }
            if (count_2>count){
                count=count_2;
            }

        }
        return count;
    }
}
