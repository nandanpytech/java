package Practice;

public class Jump_game {
    public static void main(String[] args) {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;

        int i=0;
        int index=0;
        while(i<s.length()-1){

            for(int j=i+1;j<s.length();j++){
                if(((s.charAt(j)=='0')&&(i + minJump <= j )&&(j <= Math.min(i + maxJump, s.length() - 1)))){
                    index=j;
                    break;
                }

            }
            i=index;
        }
        if(index==s.length()-1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

}
