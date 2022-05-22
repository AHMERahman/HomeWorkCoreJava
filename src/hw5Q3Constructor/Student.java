package hw5Q3Constructor;

public class Student {
//stName, stID, sex, isProgrammer(as boolean), grade (as float)

	String stName;
	int stID;
	char sex;
	Boolean isProgrammer;
	float grade;

	// Default constructor
	public Student() {
		System.out.println("This is from default Constructor of Student class.");
	}

	// Parameterized constructor
	public Student(String stName, int stID, char sex, Boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: "+stName+", ID: "+stID+", Sex: "+sex+", Grade: "+grade+ " and Java Programmer? Ans: "+isProgrammer);
	}

}
