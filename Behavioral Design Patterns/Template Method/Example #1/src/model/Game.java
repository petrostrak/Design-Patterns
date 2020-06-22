package model;

public abstract class Game {

	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// Template Method
	public final void play() {
		loadAssets();
		initialize();
		startPlay();
		if(createNewCharacter()) {
			createNewCharacterToTheGame();
		}
		endPlay();
	}
	
	//Hooked on Template Method
	protected abstract void createNewCharacterToTheGame();

	void loadAssets() {
		System.out.println("Loading Game Assets...");
	}
	
	boolean createNewCharacter() {
		return true;
	}

	protected void addNewCharacterToTheGame() {
		// TODO Auto-generated method stub
		
	}
}
