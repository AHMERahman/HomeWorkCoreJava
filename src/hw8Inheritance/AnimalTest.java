package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		Mammal mammal = new Mammal();
		Reptile reptile = new Reptile();
		Birds birds = new Birds();
		Dog dog = new Dog();
		Snake snake = new Snake();
		Robin robin = new Robin();
		BullDog bullDog = new BullDog();
		Cobra cobra = new Cobra();

//		These will call individual method
		animal.animalInfo();
		reptile.reptileInfo();
		mammal.mammalInfo();
		birds.birdsInfo();
		dog.dogInfo();
		snake.snakeInfo();
		robin.robinInfo();
		bullDog.bullDogInfo();
		cobra.cobraInfo();

//Single inheritance example - BullDog class extends Dog class  
		System.out.println("\n#Single inheritance example\n");
		bullDog.dogInfo();
		
//		Other single inheritances
		System.out.println("\n#Other single inheritances\n");
		dog.mammalInfo();
		mammal.animalInfo();
		birds.animalInfo();
		robin.birdsInfo();
		cobra.snakeInfo();
		snake.reptileInfo();
		reptile.animalInfo();
		
//Calling methods - dogInfo, mammalInfo	and animalInfo using bullDog object

		System.out.println("\n#Calling other methods using object of BullDog class\n");
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

//Calling methods - BirdsInfo, and animalInfo using robin object
//Multilevel inheritance - Robin class extends Birds class, Birds class extends Animal class.

		System.out.println("\n#Calling other methods using object of Robin class\n");
		robin.birdsInfo();
		robin.animalInfo();

//Calling methods from Snake, Reptile and Animal classes using object of Cobra class
//Multilevel inheritance example
//Cobra class extends Snake class, Snake class extends Reptile class and Reptile class extends Animal class

		System.out.println("\n#Calling other methods using object of Cobra class\n");
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		
//More multilevel Inheritance example
		System.out.println("\n#More multilevel Inheritance examples\n");
		snake.reptileInfo();
		snake.animalInfo();

//Hierarchical Inheritance example
//	Animal class is extended by Mammal, Reptile and Birds classes
		System.out
				.println("\n#Calling method in Animal class using objects of Mammal, Reptile and Birds classe class\n");
		
		mammal.animalInfo();
		reptile.animalInfo();
		birds.animalInfo();
		

		
	}

}
