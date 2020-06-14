package model;

import controller.ScoreBoard;

public class Main {

	public static void main(String[] args) {
		ScoreBoard scoreBoard = new ScoreBoard();
		
		System.out.print("Ballon Tap Score : ");
		scoreBoard.algorithmBase = new Ballon();
		scoreBoard.showScore(10, 5);
		
		System.out.print("Clown Tap Score : ");
		scoreBoard.algorithmBase = new Clown();
		scoreBoard.showScore(10, 5);
		
		System.out.print("Square Ballon Tap Score : ");
		scoreBoard.algorithmBase = new SquareBallon();
		scoreBoard.showScore(10, 5);
	}

}
