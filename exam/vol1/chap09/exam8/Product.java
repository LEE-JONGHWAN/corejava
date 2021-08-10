package vol1.chap09.exam8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import arraylist.Employee;

public class Product implements Comparable<Product> {
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product o) {
		return (this.name.compareTo(o.name));
	}


	public static void main(String[] args) {
		Product[] produ = new Product[] {
		new Product("부산행", 58000),
		new Product("스파게티", 4500),
		new Product("맥도커피", 150)
		};
		
		System.out.println("--- Arrays.sort-name");
		Arrays.sort(produ);
		for(Product result : produ) {
			System.out.println(result);
		}

		
		System.out.println("--- TreeSet-name");
		// 참고, Arrays.asList(), TreeSet(Collection)
		TreeSet<Product> treeSet = new TreeSet<Product>();
		treeSet.add(new Product("부산행", 58000));
		treeSet.add(new Product("맥도커피", 150));
		treeSet.add(new Product("스파게티", 4500));
		treeSet.first(); 
		treeSet.stream().forEach(System.out::println);

		
		
		System.out.println("--- Anonymous Comparator-price");
		// 익명 : new InterFax<E>(){
		// Arrays.sort(..., 익명객체) 사용 정렬
		Comparator<Product> minPriceComparator = new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return (int)(o1.getPrice() - (int)o2.getPrice());
			}
		};
		Arrays.sort(produ,minPriceComparator);
		Arrays.stream(produ).forEach(System.out::println);
		

		System.out.println("--- Lambda Expression-price");
		// Arrays.sort(..., 람다식)
		Arrays.sort(produ, (o1, o2)
				-> (int)(o1.getPrice() - (int)o2.getPrice()));
		Arrays.stream(produ)
		.forEach(s -> System.out.println("Product [name=" 
				+ s.getName() + ", price=" + s.getPrice() + "]"));
	}
}
