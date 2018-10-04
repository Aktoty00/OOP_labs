import java.util.Scanner;
class task_1{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Kitty", 3, "white", 100);
        System.out.println(cat2.defineAnimal());
        System.out.println(cat2.getName());

    }
}   
