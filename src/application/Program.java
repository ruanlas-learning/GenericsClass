package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import entity.Product;
import services.CalculationService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = Arrays.asList(
				new Product("Computer", 890.50),
				new Product("IPhone X", 910.00),
				new Product("Tablet", 550.00));
		
		Product x = CalculationService.max(list);
		System.out.println("Most expensive:");
		System.out.println(x);
	}
}
