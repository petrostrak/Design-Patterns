package model;

import interfaces.Command;

public class KirbyDownCommand implements Command {
	
	private KirbyReceiver kirbyCharacter;

	public KirbyDownCommand(KirbyReceiver kirbyCharacter) {
		this.kirbyCharacter = kirbyCharacter;
	}

	@Override
	public void execute() {
		kirbyCharacter.moveDown();
	}
}
