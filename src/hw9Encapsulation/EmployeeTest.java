package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeInfo = new Employee();

		employeInfo.setName("MD Abdullah");
		employeInfo.setAge(120);
		employeInfo.setSex('M');
		employeInfo.setUsCitizen(true);

		System.out.println("Employe Name: " + employeInfo.getName() + "\nEmploye Age: " + employeInfo.getAge()
				+ "\nEmployee Sex: " + employeInfo.getSex() + "\nEmployee US citizen? " + employeInfo.isUsCitizen());

	}

}
