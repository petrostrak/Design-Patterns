package model;

import interfaces.Command;

public class MarioDownCommand implements Command{
	
	private MarioReceiver marioCharacter;

	public MarioDownCommand(MarioReceiver marioCharacter) {
		this.marioCharacter = marioCharacter;
	}

	@Override
	public void execute() {
		marioCharacter.moveDown();
	}
	
}
