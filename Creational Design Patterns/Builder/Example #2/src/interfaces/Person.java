package interfaces;

public interface Person {
	String getFirstName();
	String getLastName();
	String getPhoneNumber();
	int getAge();
	String getAddress();
	
	class DefaultPerson implements Person {

		//Required Parameters
		private String firstName;
		private String lastName;
		
		//Optional Parameters
		protected String phoneNumber;
		protected String address;
		protected int age;
		
		
		
		public DefaultPerson(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		protected DefaultPerson(Builder builder) {
			this(builder.getFirstName(), builder.getLastName());
			this.phoneNumber = builder.phoneNumber;
			this.address = builder.address;
			this.age = builder.age;
		}

		public String getFirstName() {
			return this.firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return this.lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getAge() {
			return this.age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person Object [firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber
					+ ", address=" + this.address + ", age=" + this.age + "]";
		}
		
	}
	
	//Inner Class
	class Builder extends DefaultPerson{

		public Builder(String firstName, String lastName) {
			super(firstName, lastName);
		}
		
		public Builder phone(String phone) {
			this.phoneNumber = phone;
			return this;
		}
		
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Person build() {
			return new DefaultPerson(this);
		}
	}
}
