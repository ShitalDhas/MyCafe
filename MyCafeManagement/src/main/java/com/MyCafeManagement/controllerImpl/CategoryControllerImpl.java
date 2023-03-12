package com.MyCafeManagement.controllerImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.MyCafeManagement.POJO.Category;
import com.MyCafeManagement.constants.CafeConstants;
import com.MyCafeManagement.controller.CategoryController;
import com.MyCafeManagement.service.CategoryService;
import com.MyCafeManagement.utils.CafeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {
	private final CategoryService categoryService = null;

	@Override
	public ResponseEntity<String> addCategory(Map<String, String> requestMap) {
		try {
			return categoryService.addCategory(requestMap);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<List<Category>> getCategories(String filterValue) {
		try {
			return categoryService.getCategories(filterValue);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> updateCategory(Map<String, String> requestMap) {
		try {
			return categoryService.updateCategory(requestMap);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
