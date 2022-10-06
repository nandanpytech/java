package Practice;

public class SortSentence {
    public static void main(String[] args) {
      String s="is2 sentence4 This1 a3";
      String [] pos=new String[10];
      pos=s.split(" ");

      String[] ch= new String[pos.length];
      for(int i=0;i< pos.length;i++){
          char index=pos[i].charAt(pos[i].length()-1);      //get number in char form '2';
          int a=Character.getNumericValue(index);               //where we converts the '2' to 2;
          ch[a-1]=pos[i].substring(0,pos[i].length()-1);
      }
      String rs=String.join(" ",ch);
        System.out.println(rs);




    }

}
