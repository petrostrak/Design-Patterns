package interfaces;

public class IceCreamDecorator implements IceCream {

	private IceCream iceCream;
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public double cost() {
		return iceCream.cost();
	}

}
