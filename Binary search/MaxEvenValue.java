public class MaxEvenValue {
    public static void main(String[] args) {
        int []arr={1,2,252,1152,544548,121,2142};
        int ans=FindIT(arr);
        System.out.println(ans);
    }
    static int FindIT(int[]arr){
        int count=0;
        for(int i:arr){
            if(even(i)){                       //it send the number to check for even or odd.Here even means it should contain even no.of digits
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int checkit=digitofNumber2(num);       //it send the number to count of digits included in the number.
        return checkit%2==0;                  //if no.of digits completly divided by two then it is even number
    }
    static int digitofNumber(int num){
        int count=0;
        while(num>0){                     //it checks the no.of digits in the number and return total no.of digits in count.
            count++;
            num=num/10;
        }
        return count;
    }
    static int digitofNumber2(int num){
        return (int)(Math.log10(num))+1;        //This is the shortcut to find the no.of digits in the Number
    }

}
