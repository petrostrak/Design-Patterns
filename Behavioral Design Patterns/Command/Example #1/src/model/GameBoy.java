package model;

import interfaces.Command;

public class GameBoy {
	
	private Command upCommand, downCommand, leftCommand, rightCommand;

	public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
		this.upCommand = upCommand; //concrete commands
		this.downCommand = downCommand;
		this.leftCommand = leftCommand;
		this.rightCommand = rightCommand;
	}

	public void arrowUp() {
		upCommand.execute();
	}

	public void arrowDown() {
		downCommand.execute();
	}

	public void arrowRight() {
		rightCommand.execute();
	}

	public void arrowleft() {
		leftCommand.execute();
	}
}
