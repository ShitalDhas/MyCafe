package com.MyCafeManagement.controllerImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.MyCafeManagement.Wrapper.UserWrapper;
import com.MyCafeManagement.constants.CafeConstants;
import com.MyCafeManagement.controller.UserController;
import com.MyCafeManagement.service.UserService;
import com.MyCafeManagement.utils.CafeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor

@RestController
public class UserControllerImpl implements UserController {
	//private final UserService userService = null;

	@Autowired
	UserService userService;
	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		try {
			return userService.signUp(requestMap);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<String> login(Map<String, String> requestMap) {
		  try{
	            return userService.login(requestMap);
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<List<UserWrapper>> getAllUsers() {
		  try {
	            return userService.getAllUsers();
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	@Override
	public ResponseEntity<String> update(Map<String, String> requestMap) {
		try {
            return userService.update(requestMap);
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

	@Override
	public ResponseEntity<String> checkToken() {
		 try {
	            return userService.checkToken();
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	@Override
	public ResponseEntity<String> changePassword(Map<String, String> requestMap) {
		 try{
	            return userService.changePassword(requestMap);
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	@Override
	public ResponseEntity<String> forgotPassword(Map<String, String> requestMap) {
		 try {
	            return userService.forgotPassword(requestMap);
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	    }

}
