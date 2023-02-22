package com.ojas.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.entity.ProductEntity;
import com.ojas.model.Product;
import com.ojas.repository.ProductRepository;

@Service
public class ProductImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public int addproduct(Product pro) {
		// TODO Auto-generated method stub
		ProductEntity proEn = new ProductEntity();
		proEn.setPid(pro.getPid());
		proEn.setPname(pro.getPname());
		proEn.setQty(pro.getQty());
		proEn.setPrice(pro.getPrice());
		repo.save(proEn);
		return 0;
	}

	@Override
	public List<Product> viewProducts() {
		List<ProductEntity> ProductRecords = repo.findAll();
		List<Product> addProducts = new ArrayList<Product>();

		for (ProductEntity en : ProductRecords) {
			Product pro = new Product();
			BeanUtils.copyProperties(en, pro);

			addProducts.add(pro);
		}

		return addProducts;

	}

	@Override
	public Product editProduct(int pid) {
		// TODO Auto-generated method stub
		java.util.Optional<ProductEntity> proEntity = repo.findById(pid);
		ProductEntity product = proEntity.get();
		Product prod = new Product();
		BeanUtils.copyProperties(product, prod);
		return prod;
	}

	@Override
	public void deleteProduct(int pid) {

		repo.deleteById(pid);

	}

	@Override
	public int updateProduct(Product product) {
		int count = 0;

		ProductEntity proEntity = new ProductEntity();
		BeanUtils.copyProperties(product, proEntity);
		ProductEntity pro1 = repo.saveAndFlush(proEntity);
		if (pro1 != null) {
			count = 1;
		}
		return count;
	}

}
