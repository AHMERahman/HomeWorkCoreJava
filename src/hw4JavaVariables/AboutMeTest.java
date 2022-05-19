package hw4JavaVariables;

public class AboutMeTest {

		public static void main(String[] args) {

		AboutMe aboutme = new AboutMe();// Constructor is initialized

		aboutme.name = "AHM Rahman";

// Variables are initialized
		aboutme.myAge = 110;
		aboutme.myHouseMortgage = 4500;
		aboutme.mySalary = 250000;
		aboutme.myBankBalance = 250000000000L;
		aboutme.myHeight = 5.9f;
		aboutme.myScore = 4.00;
		aboutme.mySex = 'M';
		aboutme.usCitizen = false;

		aboutme.aboutMe(); // Method is initialized

//		Second person information

		AboutMe aboutAlex = new AboutMe();// Constructor is initialized

		aboutAlex.name = "Alex Dunphy";

		// Variables are initialized

		aboutAlex.myAge = 25;
		aboutAlex.myHouseMortgage = 10000;
		aboutAlex.mySalary = 1000000;
		aboutAlex.myBankBalance = 5550000000000L;
		aboutAlex.myHeight = 5.6f;
		aboutAlex.myScore = 3.75;
		aboutAlex.mySex = 'F';
		aboutAlex.usCitizen = true;

		aboutAlex.aboutMe(); // Method is initialized
		

	}
}
