package hw6IfElseCondition01;

public class Voter {

	public static void main(String[] args) {

		int age = 70;
		if (age == 18) {
			System.out.println("I am a voter");// problem a
		} else if (age < 18) {
			System.out.println("I am not a voter"); // problem b
		} else if (age > 18) {
			System.out.println("I am a voter"); // problem c
		} else {
			System.out.println("Please add a valid age");
		}

	}

}
