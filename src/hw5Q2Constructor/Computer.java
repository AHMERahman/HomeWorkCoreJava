package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	// Default constructor
	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");

	}

	// parameterized constructor 1
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;

		System.out.println("\nMy Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: " + price + ", Grade: " + grade + " and Made in USA? Ans: " + madeInUSA);

	}

	// parameterized constructor 2
	public Computer(String brand, String operatingSystem, boolean madeInUSA, int price) {
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.madeInUSA = madeInUSA;
		this.price = price;

		System.out.println("\nBrand: " + brand + ", Operating System: " + operatingSystem + ", Made in USA? Ans: "
				+ madeInUSA + ", Price: " + price);

	}

}
