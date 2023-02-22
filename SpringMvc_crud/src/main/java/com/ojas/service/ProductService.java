package com.ojas.service;

import java.util.List;

import com.ojas.model.Product;

public interface ProductService {
	public int addproduct(Product pro);
	List<Product>viewProducts();
	public Product editProduct(int pid);
	public void deleteProduct(int pid);
	public int updateProduct(Product product);
}
