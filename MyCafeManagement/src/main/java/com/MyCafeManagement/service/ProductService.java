package com.MyCafeManagement.service;

import org.springframework.http.ResponseEntity;

import com.MyCafeManagement.Wrapper.ProductWrapper;

import java.util.List;
import java.util.Map;

public interface ProductService {
	public ResponseEntity<String> addProduct(Map<String, String> requestMap);

	public ResponseEntity<List<ProductWrapper>> getAllProducts();

	public ResponseEntity<String> updateProduct(Map<String, String> requestMap);

	public ResponseEntity<String> deleteProduct(Integer id);

	public ResponseEntity<String> updateStatus(Map<String, String> requestMap);

	public ResponseEntity<List<ProductWrapper>> getByCategory(Integer id);

	public ResponseEntity<ProductWrapper> getById(Integer id);
}
