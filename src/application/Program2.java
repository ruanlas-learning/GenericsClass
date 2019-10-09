package application;

import java.util.Arrays;
import java.util.List;

import entity.Circle;
import entity.Rectangle;
import entity.Shape;

public class Program2 {
	public static void main(String[] args) {
		List<Shape> myShapes = Arrays.asList(
				new Rectangle(3.0, 2.0),
				new Circle(2.0));
		
		List<Circle> myCircles = Arrays.asList(
				new Circle(2.0),
				new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
