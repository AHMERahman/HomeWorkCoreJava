package hw9Abstraction;

public interface University {

	public void classSize();
	public void playGround();
	public void teacher();

	default void gymnasium() {
		
	}
	
	public static void library() {
		
	}
	
	
	
	
	
	
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
