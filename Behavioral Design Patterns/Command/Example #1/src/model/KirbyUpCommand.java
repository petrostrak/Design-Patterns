package model;

import interfaces.Command;

public class KirbyUpCommand implements Command {
	
	private KirbyReceiver kirbyCharacter;

	public KirbyUpCommand(KirbyReceiver kirbyCharacter) {
		this.kirbyCharacter = kirbyCharacter;
	}

	@Override
	public void execute() {
		kirbyCharacter.jumpUp();
	}
	
}
