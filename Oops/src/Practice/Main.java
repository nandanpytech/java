package Practice;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int n=5;
        Employee[] nandan=new Employee[5];
        nandan[0]=new Employee("Rajesh",new Date(2001,06,26));
        nandan[1]=new Employee("Rohan",new Date(2006,05,19));
        nandan[2]=new Employee("Sahan",new Date(2003,11,16));
        nandan[3]=new Employee("Charan",new Date(2003,11,17));
        nandan[4]=new Employee("Naveen",new Date(2007,03,10));


        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ////swap the two object
                if(nandan[i].date.before(nandan[j].date)){
                    Employee temp=nandan[i];
                    nandan[i]=nandan[j];
                    nandan[j]= temp;
                }
            }
        }
        System.out.println("Employees List of joining");
        for(int i=0;i<n;i++){
            nandan[i].display();
        }

    }
}
class Employee {
    String name;
    Date date;
    Employee(String name,Date date){
        this.date=date;
        this.name=name;
    }
    public void display(){
        System.out.println("Employeename:"+ name +" and"+
                " joineddate:" + date.getDate()+"/" +date.getMonth()+"/"+date.getYear());
    }
}
