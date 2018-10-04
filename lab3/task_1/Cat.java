public class Cat extends Animal{
	private int cat_id;
	public int getCatID(){
		return this.getCatID;
	}
	public Cat(){
		super();
		cat_id = 0;
	}
	public Cat(String initialname, int initialage, String initialcolor, int initialcat_id){
		super(initialname, initialage,initialcolor);
		cat_id = initialcat_id;
	}
	public Cat(String name_, int cat_id_){
		super(name_);
		cat_id = cat_id_;
	}
	public int get_cat_id(){
		return this.cat_id;
	}
	public void set_cat_id(int new_cat_id){
		cat_id = new_cat_id;
	}
	public String defineAnimal(){
		return "Cat's name is: " + this.name + " age is: "+ this.age+ " color is: " + this.color + " catID is: " + this.cat_id;
	}

}