package hw10UseOfSuperInChildClass;

public class Father {

//	Name, age, sex, usCitizen, FamilyName.
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

//	Default constructor
	Father() {

		System.out.println("This is from default constructor of Father class");
	}

//	Parameterized constructor
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("This is parameterized constructor of Father class\n" + "Name: " + name + "\nAge: " + age
				+ "\nSex: " + sex + "\nUS Citizen? " + usCitizen);
	}

//	Method with void return type

	public void father() {

		System.out.println("This is a regular method of Father class");
	}

//	Parameterized method

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println("This is parameterized method of Father class\n" + "Name: " + name + "\nAge: " + age + "\nSex: " + sex
				+ "\nUS Citizen? " + usCitizen);

	}

}
