package model;

import controller.ScoreAlgorithmBase;

public class Ballon extends ScoreAlgorithmBase {

	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) - 10;
	}

}
