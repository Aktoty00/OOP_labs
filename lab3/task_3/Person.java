public class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public Person(){
		this.name = "NO_NAME";
	}
	public String getName(){
		return this.name;
	}
	public boolean equals(Object obj){
		if(obj instanceof Person)
			return this.name == ((Person) obj).name;
		else
			return false;
	}
	public String toString(){
    	return("Person's name is:  " + this.name);
	}
}