package models;

import java.util.HashMap;

import interfaces.Shape;

public class ShapeFactory {

	private static final HashMap circleMap = new HashMap();
	
	//Static to invoke without to instantiate
	public static Shape getCircle(String color) {
		Circle circle = (Circle)circleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Making circle of color : " + color);
		}
		return circle;
	}
	
}
