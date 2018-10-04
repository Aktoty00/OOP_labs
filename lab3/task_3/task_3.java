import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class task_3{
    public static void main(String args[]){
        Employee emp1 = new Employee("Will", 250000, 2007, "17YEAR110365");
        Employee emp2 = new Employee("Smith", 200000, 2013, "13YEAR125974");
        List<Employee> groupOfEmployee1 = new ArrayList<Employee>();
        groupOfEmployee1.add(emp1);
        groupOfEmployee1.add(emp2);
        Manager manager1 = new Manager("John", groupOfEmployee1, 5000);
        Manager manager2 = new Manager("Omar", groupOfEmployee1, 5000);


        //System.out.println(emp1.equals(emp2));
        //System.out.println(emp1.toString());
        //System.out.println(emp2.toString());
        System.out.println(manager1.toString());
        System.out.println(manager1.equals(manager2));

    }
}   