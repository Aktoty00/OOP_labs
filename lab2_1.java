import java.util.Scanner;
class Student{
    public String name;
    public String id;
    public int year;

    public Student(String name, String id, int year){
        this.name = name;
        this.id = id;
        this.year = year;
    }
    public void yearInсrement(){
        this.year++;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name1){
        this.name = name1;
    }

    public String getID(){
        return this.id;
    }

    public int getYear(){
        return this.year;
    }
}
class lab2_1{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        Student me = new Student("Aktoty", "17BD110365", 2);  
        System.out.println(me.getName());
        System.out.println(me.getID());
        me.yearInсrement();
        System.out.println(me.getYear());

    }
}   
