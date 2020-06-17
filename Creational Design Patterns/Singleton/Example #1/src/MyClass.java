
public class MyClass {
	
	private static MyClass uniqueInstance = new MyClass(); // The eagerly way
//	private static MyClass uniqueInstance; // The lazy way
	String name;

	private MyClass() {}
	
	// The lazy way 
	//Adding the synchronized key-word makes our singleton thread-safe.
	public static /*synchronized*/ MyClass getInstance() {
//		if(uniqueInstance == null)
//			uniqueInstance = new MyClass();
		return uniqueInstance; // The eagerly way
	}
}
