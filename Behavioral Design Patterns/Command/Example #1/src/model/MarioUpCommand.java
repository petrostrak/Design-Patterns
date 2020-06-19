package model;

import interfaces.Command;

public class MarioUpCommand implements Command {
	
	private MarioReceiver marioCharacter;
	
	public MarioUpCommand(MarioReceiver marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		marioCharacter.jumpUp();
	}

}
