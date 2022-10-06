package Practice;

public class Reverse {
    public static void main(String[] args) {
        String  s = "Let's take LeetCode contest";
        String[] pos =new String[s.length()/2];
        pos=s.split(" ");
        for(int i=0;i<pos.length;i++){
            String a=pos[i];
            String temp="";
            for(int j=a.length()-1;j>-1;j--){
                temp+=a.charAt(j);
            }
            pos[i]=temp;
        }
        String ans=String.join(" ",pos);
        System.out.println(ans);
    }
}
