package hw8Abstraction;

public abstract class MedicalSchool {
	
//	abstract method
		public abstract void anatomyLab();

//	Non abstract method
		public void biochemistryLab() {
			System.out.println("this is non abstract mehtod in abstract class");
			
			}
//	Yes, we can create a Constructor in abstract class
		
		public MedicalSchool() {
		
	}
}
