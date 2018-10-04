public class Employee extends Person{
	private double salary;
	private int year;
	private String insuranceNumber;
	public Employee(){
		super();
		this.salary = 0;
		this.year = 0;
		this.insuranceNumber = "no_insuranceNumber";
	}
	public Employee(String initialName, double initialSalary, int initialYear, String initialInsuranceNumber){
		super(initialName);
		salary = initialSalary;
		year = initialYear;
		insuranceNumber = initialInsuranceNumber;
	}
	public double getSalary(){
		return this.salary;
	}

	public String getInsuranceNumber(){
		return this.insuranceNumber;
	}

	public int getYear(){
		return this.year;
	}
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Employee)
			return super.equals(obj)&& 
		this.insuranceNumber == ((Employee) obj).insuranceNumber&&
		this.salary == ((Employee) obj).salary&&
		this.year == ((Employee) obj).year;
		else
			return false;
	}
	@Override
	public String toString(){
    	return(super.toString() + "; Employee's salary is:  " + this.salary + "; Employee's year is:  " + this.year + "; Employee's insurance number is:  " +this.insuranceNumber);
	}
}