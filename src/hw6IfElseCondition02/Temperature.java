package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		System.out.println("Enter today's temperature: ");

		Scanner scanner = new Scanner(System.in);
		int todyasTemperature = scanner.nextInt();
		scanner.close();

		if (todyasTemperature < 32) {

			System.out.println("Freezing");

		} else if (todyasTemperature < 55) {

			System.out.println("Pleasant");

		} else if (todyasTemperature < 73) {

			System.out.println("Getting Warmer");

		} else if (todyasTemperature < 101) {

			System.out.println("Hot");

		} else {
			System.out.println("Ice on my Head please");
		}
	}

}
