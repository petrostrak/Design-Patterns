package model;

import interfaces.Command;

public class MarioLeftCommand implements Command{
	
	private MarioReceiver marioCharacter;

	public MarioLeftCommand(MarioReceiver marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		marioCharacter.moveLeft();
	}
	
}
