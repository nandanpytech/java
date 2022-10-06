package Practice;

public class Sting {
    public static void main(String[] args) {
        String[] nandan={"flower","hello"};
        loop(nandan);
    }
    static void loop(String[]nandan){
        for(int i=0;i<nandan.length;i++){
            for(int j=0;j<nandan[i].length();j++){
                System.out.println(nandan[i].charAt(j));
            }
        }
    }
}
