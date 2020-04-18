package org.cap.dao;

import java.util.List;

import javax.persistence.*;

import org.cap.entities.Product;
import org.cap.exceptions.ProductNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements IProductDao{
	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	 @PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	 
	 
	 @Override
	public Product addProduct(Product product) {
		if (product==null)
		{
			throw new ProductNotFoundException("Product details are not provided");
		}
	return getEntityManager().merge(product);
	
	}
	
	@Override
	public List<Product> fetchAllProduct() {
		String operation="From Product";
		TypedQuery<Product> query=entityManager.createQuery(operation,Product.class);
		List<Product> ProductList=query.getResultList();
		return ProductList;
		
		
	}
	@Override
	public Product findById(int productId) {
		Product product=entityManager.find(Product.class, productId);
		if(product==null)
		{
			throw new ProductNotFoundException("product does not exist with given id  :"+productId);
		}
		return product;
	}
	
	@Override
	public String deleteProduct(int productId) {
		Product product=findById(productId);
		if(product==null)
		{
			throw new ProductNotFoundException("product is not exists");
		}
      entityManager.remove(product);
     return "Data of specified product is deleted";
	}
	
	@Override
	public Product updateProduct(Product product) {
		return entityManager.merge(product);
	}










}
