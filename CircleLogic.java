package com.chinhamhora;

public class CircleLogic {

	public double calcArea(Circle circle) {
		return Math.PI * circle.getRadius() * circle.getRadius();
	}

	public double calcCircumference(Circle circle) {
		return 2.0 * Math.PI * circle.getRadius();
	}

	public double calcDiameter(Circle circle) {
		return 2.0 * circle.getRadius();
	}
	
}
