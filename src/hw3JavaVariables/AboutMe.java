package hw3JavaVariables;

public class AboutMe {

	public String name; // String declared
	public String name2 = "Enthrall IT"; // String initialized
	public byte height = 54;
	public short zipCode = 17957;
	public int mySalary = 1000000;   
	public long bigNumber = 283048573020437L; // long value contains an l at the end
	public float xValue = 5.4566f;
	public double yValue = 3.54;

	public char mySex = 'M';
	public boolean statement = false;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("Company name: " + aboutMe.name2);
		System.out.println("Zipcode: " + aboutMe.zipCode);
		System.out.println("Salary = " + aboutMe.mySalary + "\nExample of a long variable: " + aboutMe.bigNumber);
		System.out.println("The above statments are " + aboutMe.statement);

	}

}
