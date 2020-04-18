package org.cap.service;
import java.util.List;

import javax.transaction.Transactional;

import org.cap.dao.IProductDao;
import org.cap.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class ProductService implements IProductService{
	private IProductDao productDao;
	

	public IProductDao getProductDao() {
		return productDao;
	}
@Autowired
	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	
	}

	@Override
	public List<Product> fetchAllProduct() {
		return productDao.fetchAllProduct();
	}
	
	@Override
	public Product findById(int productId) {
		return productDao.findById(productId);
	}
	
	@Override
	public String deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
		}
	
	@Override
	public Product updateProduct(Product product) {
		return productDao.updateProduct(product);
		
	}
	
}