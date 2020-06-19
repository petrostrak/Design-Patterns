package model;

import interfaces.Command;

public class MarioRightCommand implements Command {
	
	private MarioReceiver marioCharacter;

	public MarioRightCommand(MarioReceiver marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		marioCharacter.moveRight();
	};
	
}
