package task_3;
import java.util.List;

public class Manager extends Person{
    public String managerName;
    public double bonus;
    public List<Employee> groupOfEmployee;

    public Manager(String managerName,List<Employee> groupOfEmployee, double bonus){
        this.managerName = managerName;
        this.groupOfEmployee = groupOfEmployee;
        this.bonus = bonus;
    }
    public String getManagerName(){
        return this.managerName;
    }
    public double getBonus(){
        return this.bonus;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Manager)
            return super.equals(obj)  &&
                    this.managerName == ((Manager) obj).managerName  &&
                    this.groupOfEmployee == ((Manager) obj).groupOfEmployee  &&
                    this.bonus == ((Manager) obj).bonus;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Manager " + this.managerName +" has a team: "+groupOfEmployee + " and bonus: "+ this.bonus + "\n";
    }
}
