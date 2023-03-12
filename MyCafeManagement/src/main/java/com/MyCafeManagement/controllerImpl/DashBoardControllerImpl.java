package com.MyCafeManagement.controllerImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.MyCafeManagement.controller.DashboardController;
import com.MyCafeManagement.service.DashboardService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DashBoardControllerImpl implements DashboardController{
	 private final DashboardService dashboardService = null;
	@Override
	public ResponseEntity<Map<String, Object>> getCount() {
		 try {
	            return dashboardService.getCount();
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return new ResponseEntity<>(new HashMap<>(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }

}
