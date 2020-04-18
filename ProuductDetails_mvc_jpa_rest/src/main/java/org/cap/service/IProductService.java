package org.cap.service;

import java.util.List;

import org.cap.entities.Product;



public interface IProductService {
	Product addProduct(Product product);
	List<Product> fetchAllProduct();
	Product findById(int productId);
	String deleteProduct(int productId);
	Product updateProduct(Product product);
	

}
