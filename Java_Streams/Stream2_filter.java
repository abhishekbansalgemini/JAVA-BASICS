package Streams_in_java;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.price = price;
		this.name = name; 
	}
}

public class Stream2_filter {
	public static void main(String[] args) {
		 List<Product> proList = new ArrayList<>();
		 proList.add(new Product(1, "fan", 2500));
		 proList.add(new Product(2, "cooler", 3500));
		 proList.add(new Product(3, "laptop", 25000));
		 proList.add(new Product(4, "Macbook", 85000));
		 proList.add(new Product(5, "Mobile", 25000));
		 
		 //want to filter product acc to price of an project.
		 
		 proList.stream().filter(p -> p.price >= 25000).forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));
		 
		 proList.stream().forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));
				 
	}
}
