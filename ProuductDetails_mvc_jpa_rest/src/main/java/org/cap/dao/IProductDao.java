package org.cap.dao;

import java.util.List;

import org.cap.entities.Product;

public interface IProductDao {
	Product addProduct(Product product);
	List<Product> fetchAllProduct();
	Product findById(int productId);
	String deleteProduct(int productId);
	Product updateProduct(Product product);
	
	
}
