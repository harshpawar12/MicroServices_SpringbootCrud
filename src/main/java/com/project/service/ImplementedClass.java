package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Exceptionn.IdAreMissingException;
import com.project.Exceptionn.IdNotFoundException;
import com.project.model.ProductModel;
import com.project.repository.productRepo;

@Service
public class ImplementedClass implements ProductService {
	@Autowired
	private productRepo repository;

	@Override
	public ProductModel isAddproduct(ProductModel ob) {
		if(repository!=null)
		{
		return repository.save(ob);
		}else {
			return null;
		}
	}

	@Override
	public List<ProductModel> isgetAll() {
		List<ProductModel>al=repository.findAll();
		return al;
	}

	@Override
	public Optional<ProductModel> isgetId(int proid){
		if(repository.existsById(proid))
		{
			return repository.findById(proid);
		}else {
			throw new IdAreMissingException("IdAreMissingException....!!");
		}
	}

	@Override
	public ProductModel isUpdate(int proid, ProductModel ob){
	ProductModel	prodata=repository.findById(proid).orElse(null);
	if(prodata!=null)
	{
		return repository.save(ob);
	}
	throw new IdNotFoundException("IdNotFoundException....!!");
	}

	@Override
	public String isdelete(int proid) {
		if(repository.existsById(proid))
		{
			repository.deleteById(proid);
			return "deleted";
		}else {
			throw new IdNotFoundException("IdNotFoundException....!!");
		}

	}

	
	
	

}
