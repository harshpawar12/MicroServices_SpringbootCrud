package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.Exceptionn.IdAreMissingException;
import com.project.model.ProductModel;

public interface ProductService {
	
	public ProductModel isAddproduct(ProductModel ob);
	public List<ProductModel> isgetAll();
	public Optional<ProductModel> isgetId(int proid);
	public ProductModel isUpdate(int proid,ProductModel ob);
	public String isdelete(int proid);
}
