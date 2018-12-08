package OOPsproject1;

public class demoOfInheritance {

	public static void main(String[] args) {
		
		
		inheritancesubclass a = new inheritancesubclass();
		a.Parentclass1();
		a.Parentclass2();
		a.childclass1();
		a.childclass2();
		a.childclass3();
		System.out.println(a.num);
		
		InheritanceParent b = new InheritanceParent();
		b.Parentclass1();
		b.Parentclass2();
		
		System.out.println(b.num);
		

		
	
		
		
		
		InheritanceParent c = new inheritancesubclass();
		
		c.Parentclass1();
		c.Parentclass2();

		
		System.out.println(c.num);
		
	
		
		
		

		
		
		
		
	}

}
