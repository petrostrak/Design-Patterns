package controller;

public class CreditCartAlgorithm implements Payment {
	private String name;
	private String cardNumber;
	
	public CreditCartAlgorithm(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.print(amount + " paid with Cart.");
	}
	
}
