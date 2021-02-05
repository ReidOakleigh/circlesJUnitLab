package com.chinhamhora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CircleTests {
	protected Circle circle;
	protected CircleLogic cl;

	@Before
	public void setUp() {
		circle = new Circle(1.0);
		cl = new CircleLogic();
	}
	
	@Test
	public void testArea() {
		assertEquals(Math.PI * circle.getRadius() * circle.getRadius(),
				cl.calcArea(circle), .01);
	}

	@Test
	public void testCircumference() {
		assertEquals(2.0 * Math.PI * circle.getRadius(), cl.calcCircumference(circle), .01);
	}
	
	@Test
	public void testDiameter() {
		assertEquals(2.0 * circle.getRadius(), cl.calcDiameter(circle), .01);
	}
}
