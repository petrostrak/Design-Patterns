package model;

import interfaces.Command;

public class KirbyRightCommand implements Command{
	
	private KirbyReceiver kirbyCharacter;

	public KirbyRightCommand(KirbyReceiver kirbyCharacter) {
		this.kirbyCharacter = kirbyCharacter;
	}

	@Override
	public void execute() {
		kirbyCharacter.moveRight();
	}
	
}
