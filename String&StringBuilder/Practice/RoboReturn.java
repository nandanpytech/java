package Practice;

public class RoboReturn {
    public static void main(String[] args) {
        String moves="RDLURD";
        int count=0;
        for(int i=0;i<moves.length();i++){
            char a=moves.charAt(i);
            switch (a){
                case 'R':
                    count+=2;
                    break;
                case 'L':
                    count-=2;
                    break;
                case 'U':
                    count++;
                    break;
                case 'D':
                    count--;
                    break;
            }
        }
        if(count!=0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
