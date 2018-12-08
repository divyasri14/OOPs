package OOPsproject1;

public class DemoOfEncapsualtion {

	public static void main(String[] args) {
		
		Encapsulation1 divya = new Encapsulation1();
		
		divya.setBonous(2000);
		
		System.out.println(divya.getBonous());
		
		
		divya.setSalary(2000);
				
		System.out.println(divya.getSalary());
		
		
		System.out.println("totalsalary is :"  +divya.calcuatesalary());

	
	}

}
