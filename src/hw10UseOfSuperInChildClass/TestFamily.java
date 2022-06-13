package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		
		System.out.println("---------- default constructor initialized from Daughter Class ----------");
			Daughter daughter1 = new Daughter();
		
		System.out.println("\n---------- parameterized constructor initialized from Daughter Class ----------");
			Daughter daughter2 =new Daughter("August", 56);
		
		System.out.println("\n---------- void type method initialized from Daughter Class ----------");
			daughter1.daughter();
		
		System.out.println("\n---------- parameterized method initialized from Daughter Class ----------");
			daughter1.daughterInfo("September", 68);
		
		System.out.println("\n---------- default constructor initialized from Father Class ----------");
			Father father1 =new Father();
		
		System.out.println("\n---------- parameterized constructor initialized from Father Class ----------");
			Father father2 = new Father("Hasan", 70, 'M', true);
		
		System.out.println("\n---------- void type method initialized for Father Class ----------");
			father1.father();
		
		System.out.println("\n---------- parameterized method initialized for Father Class ----------");
			father1.fatherInfo("Golam", 57, 'M', true);
	
		
	
	
	}

}
