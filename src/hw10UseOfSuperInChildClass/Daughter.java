package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

//	Default constructor
	public Daughter() {
//		super(); either default or parameterized constructor can be used, not both. this is the first statement
		super("Abdul", 60, 'M', true);
		super.father();
		super.fatherInfo("May", 67, 'M', true);

		super.age = 70;
		super.name = "Kabul";
		super.sex = 'M';
		super.usCitizen = true;
		
		super.familyName ="Khan Family";

		System.out.println("This is a deafult construcotr from Daughter class");
	}

// Parameterized constructor
	public Daughter(String birthMonth, int age) {
		super();
		this.birthMonth = birthMonth;
		this.age = age;

		super.father();
		super.fatherInfo("April", 70, 'M', false);
		super.age = 70;
		super.name = "Kabul";
		super.sex = 'M';
		super.usCitizen = true;
		System.out.println("This is a parameterized constructor from Daughter class");
	}

//	Regular method
	public void daughter() {
		super.father();
		super.fatherInfo("Jun", 60, 'M', true);
		super.name = "Kayum";
		super.age = 57;
		super.sex = 'M';
		super.usCitizen = false;
		
		super.familyName ="Khan Family";

		System.out.println("This is from regular class of Daughter class");
	}

//	Parameterized method
	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;

		super.father();
		super.fatherInfo("July", 67, 'M', true);
		super.name = "Kayum";
		super.age = 57;
		super.sex = 'M';
		super.usCitizen = false;

		System.out.println("This is from a parameterized method of Daughter class" + "\nBirth Month: " + birthMonth
				+ "\nAge :" + age);
	}

}
