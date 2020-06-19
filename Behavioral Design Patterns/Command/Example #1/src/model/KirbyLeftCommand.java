package model;

import interfaces.Command;

public class KirbyLeftCommand implements Command {
	
	private KirbyReceiver kirbyCharacter;

	public KirbyLeftCommand(KirbyReceiver kirbyCharacter) {
		this.kirbyCharacter = kirbyCharacter;
	}

	@Override
	public void execute() {
		kirbyCharacter.moveLeft();
	}
	
}
