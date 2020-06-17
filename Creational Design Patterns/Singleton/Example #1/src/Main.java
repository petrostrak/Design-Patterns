
public class Main {

	public static void main(String[] args) {
		MyClass myClass = MyClass.getInstance();
		MyClass secondClass = MyClass.getInstance();
		
		Person person = new Person();
		Person secondPerson = new Person();
		
		myClass.name = "SingletonClass";
		
		//Testing Singleton Pattern
		
		System.out.println(myClass);
		System.out.println("Second instance of Singleton class : " + secondClass);
		
		System.out.println(person);
		System.out.println("Second instance of Person class : " + secondPerson);
	}

}
