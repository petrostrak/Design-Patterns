package model;

public class Originator {
	
	//this String is just to simplify our understanding
	//In a real life application you would have an actual
	//Java class
	private String state;

	public Originator(String state) {
		this.state = state;
	}

	public Originator() {
	}

	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		state = memento.getState();
	}
	
	
	
}
