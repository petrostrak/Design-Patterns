package model;

public class Main {

	public static void main(String[] args) {
		
		MarioReceiver mario = new MarioReceiver();
		mario.setName("Mario");
		
		KirbyReceiver kirby = new KirbyReceiver();
		kirby.setName("Kirby");
		
		//Create commands
		MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
		MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
		MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
		MarioRightCommand marioRightCommand = new MarioRightCommand(mario);
		
		KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
		KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
		KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
		KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);
		
		//Invokers
		GameBoy gameBoyMario = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
		GameBoy gameBoyKirby = new GameBoy(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
		
		gameBoyKirby.arrowleft();
		gameBoyMario.arrowRight();
	}

}
