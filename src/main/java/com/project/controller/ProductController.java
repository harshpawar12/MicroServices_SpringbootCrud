package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Exceptionn.IdAreMissingException;
import com.project.model.ProductModel;
import com.project.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService services;
	
	@PostMapping("/product")
	public ProductModel isAdd(@RequestBody ProductModel ob)
	{
		return services.isAddproduct(ob);
	}
	@GetMapping("/getall")
	public List<ProductModel> asAlldata()
	{
		return services.isgetAll();
	}
	@GetMapping("getall/{proid}")
	public Optional<ProductModel> isGetId(@PathVariable int proid) throws IdAreMissingException
	{
		return services.isgetId(proid);
	}
	@PutMapping("up/{proid}")
	public ProductModel isUpdate(@PathVariable int proid,@RequestBody ProductModel ob)
	{
		return services.isUpdate(proid, ob);
	}
	@DeleteMapping("del/{proid}")
	public String isdelete(@PathVariable int proid)
	{
		return services.isdelete(proid);
	}
	

}
