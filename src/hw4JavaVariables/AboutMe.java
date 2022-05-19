package hw4JavaVariables;

public class AboutMe {

	public String name; // String declared

	// Variables are declared
	
	public byte myAge; 
	public short myHouseMortgage;
	public int mySalary;
	public long myBankBalance; // long value contains an l at the end
	public float myHeight; // float value contains an f at the end
	public double myScore;

	public char mySex = 'M';
	public boolean usCitizen;
	
	
	//	Constructor is declared
	
	public AboutMe() {
		System.out.println("\nThis is all about us.\n");

	}

	//	Method is implemented here
	
	public void aboutMe() {

		System.out.println("My name: " + name + "\nMy Age: " + myAge + "\nMy house mortgage: " + myHouseMortgage
				+ "\nMy Salary: " + mySalary + "\nMy Bank Balance: " + myBankBalance + "\nMy Height: " + myHeight
				+ "\nMy Score: " + myScore + "\nMy Sex: " + mySex + "\nI am a US citizen: " + usCitizen);

	}

}
