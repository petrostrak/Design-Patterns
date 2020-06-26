package model;

public class Main {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		originator.setState("Monster");
		
		Memento memento = originator.createMemento();
		
		CareTaker careTaker = new CareTaker();
		careTaker.addMemento(memento);
		
		originator.setState("MonsterTwo");
		originator.setState("MonsterThree");
		
		memento = originator.createMemento();
		careTaker.addMemento(memento); 
		
		originator.setState("MonsterFour");
		
		System.out.println("Originator current state : " + originator.getState());
		System.out.println("Originator restoring to previous state ..");
		
		memento = careTaker.getMemento(1);
		originator.setMemento(memento);
		System.out.println("Originator end state : " + originator.getState());
		System.out.println("Restoring to previous state..");
		memento = careTaker.getMemento(0);
		originator.setMemento(memento);
		
		System.out.println("Originator end state : " + originator.getState());
	}

}
