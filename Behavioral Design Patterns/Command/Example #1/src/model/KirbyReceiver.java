package model;

public class KirbyReceiver {
	private String name;
	
	public void jumpUp() {
		System.out.println(getName() + " is jumping up!");
	}
	
	public void moveLeft() {
		System.out.println(getName() + " is moving left!");
	}
	
	public void moveRight() {
		System.out.println(getName() + " is moving right!");
	}
	
	public void moveDown() {
		System.out.println(getName() + " is moving down!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
