package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl  implements ProductService{
	
	static List<Product>  plist = new ArrayList<>();

	@Override
	public void addProduct(Product product) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
			
			String sql = "insert into product(name,company,price)values('"+product.getName()+"', '"+product.getCompany()+"', '"+product.getPrice()+"'  )";
			Statement stm = con.createStatement();
			stm.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		 plist.add(product); 
//		 System.out.println("=== added success == size = "+plist.size());
	}

	@Override
	public void deleteProduct(int index) {
		 
		//plist.remove(index);
	}

	@Override
	public List<Product> getAllProduct() {
		 
		
		return plist;
	}

}
