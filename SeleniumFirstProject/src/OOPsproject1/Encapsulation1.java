package OOPsproject1;

public class Encapsulation1 {
	
	private int salary;
	
	private int bonous;
	
	
	public void setBonous(int bonous) {
		this.bonous = bonous;
	}


	public int getBonous() {
		return bonous;
	}

	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getSalary() {
		return salary;
	}


	

	public int calcuatesalary() {
		
		int totalsalary = salary + bonous;
		return totalsalary;	
	}
	
	
	
	
	

}
