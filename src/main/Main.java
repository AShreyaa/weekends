package main;

import java.util.ArrayList;

import Service.ProductService;
import bean.Product;

public class Main {

	public static void main(String[] args) {
		ProductService ps=new ProductService();
		ps.addProduct(2,10, "sdf");
		ps.addProduct(5,10, "gbgf");
		ps.addProduct(6,10, "efgfb");
		ps.addProduct(10,10, "gnlkj");
		ps.addProduct(1,10, "sdvkjb");
	
	boolean b=	ps.deleteProduct(6);
	if(b) {
		System.out.println("deleted");
	}
	else {
		System.out.println("please try again later couldnt delete");
	}
	
	b=	ps.updateProduct(3,90);
	if(b) {
		System.out.println("update");
	}
	else {
		System.out.println("please try again later couldnt updated");
	}
	
	ArrayList<Product> prodArrayList2=ps.getAllProducts();
	for(Product p:prodArrayList2) {
		System.out.println(p);
	}
	
	int price=ps.getPrice(2);
	if(price>=0) {
		System.out.println("price is"+price);
		
	}
	else {
		System.out.print("not found");
	}
	
	
	}

}
