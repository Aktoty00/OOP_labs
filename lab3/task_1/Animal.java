public class Animal{
	private String name;
	private int age;
	private String color;
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getColor(){
		return this.color;
	}
	public Animal(){
		name = "no_name";
		age = 0;
		color = "no_color";
	}
	public Animal(String name){
		this.name = name;
		age = 2;
		color = "black";
	}
	public Animal(String initialname, int initialage, String initialcolor){
		name = initialname;
		age = initialage;
		color = initialcolor;
	}
	public String getName(){
		return this.name;
	}
	public String defineAnimal(){
		return "Animal's name is: " + this.name + " age is: "+ this.age+ " color is: " + this.color;
	}

}