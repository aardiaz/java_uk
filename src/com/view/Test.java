package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		add();
		getAll();
		delete();
		//project list after deleted
		getAll();
	}

	// add product
	static void add() {

		ProductService ps = new ProductServiceImpl();
		char flag = 'y';
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter id");
			System.out.println("Enter name");
			System.out.println("Enter price");
			System.out.println("Enter company");
			Product p = new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
			ps.addProduct(p);

			System.out.println("do you want add more products[y/n]");
			flag = sc.next().charAt(0);

		} while (flag == 'y');

	}
	
	//get all products
	
	static void getAll() {
		
		ProductService ps = new ProductServiceImpl();
		List<Product>  plist = ps.getAllProduct();
		
		System.out.println(plist);
	}
	
	//delete
	static void delete() {
		
		ProductService  ps = new ProductServiceImpl();
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter index to delete product ..");
		ps.deleteProduct(sc.nextInt());
	}
	
}
