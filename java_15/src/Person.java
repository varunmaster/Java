
public class Person {
	private String FName;
	private String LName;
	private int Birth;
	
	// constructor (init. new person instances)
	public Person (String First, String Last, int year){
		this.FName = First;
		this.LName = Last;
		this.Birth = year;
	}
	//accesor aka "getter" methods
	public String getFName(){
		return this.FName;
	}
	
	public String getLName() {
		return this.LName;
	}
	
	public int getBirth(){
		return this.Birth;
	}
	
	public String getFullName(){
		return this.FName + " " + this.LName;
	}
	public int getAge(){
		return 2015 - this.Birth; //todo: use system clock
	}
	public int getAge(int currentYear){
		return currentYear - this.Birth;
	}
}
