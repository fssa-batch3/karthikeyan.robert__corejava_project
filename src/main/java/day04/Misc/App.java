package day04.Misc;

public class App {
	public static void main(String[] args) {
		Square square = new Square(5.0);

	
		double length = square.getLength();
		System.out.println("Length of the square: " + length);

		
		double area = square.calculateArea();
		System.out.println("Area of the square: " + area);
	}
}
