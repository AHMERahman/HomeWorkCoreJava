package hw8Abstraction;

public interface University {

	public void classSize();
	public void playGround();
	public void teacher();

	/*
	 * public University() {
	 * 
	 * }
	 */
//	No you cannot create a constructor inside an interface
//	Constructor has the same name as Class
//	Method declared in interface is implemented by a class and can be overriden
//	A constructor cannot be overrriden

}
