package com.MyCafeManagement.controllerImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.MyCafeManagement.POJO.Bill;
import com.MyCafeManagement.constants.CafeConstants;
import com.MyCafeManagement.service.BillService;
import com.MyCafeManagement.utils.CafeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class BillControllerImpl implements BillService{
	 private final BillService billService = null;

	@Override
	public ResponseEntity<String> generateReport(Map<String, Object> requestMap) {
		   try {
	            return billService.generateReport(requestMap);
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	@Override
	public ResponseEntity<List<Bill>> getBills() {
		 try {
	            return billService.getBills();
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	@Override
	public ResponseEntity<byte[]> getPdf(Map<String, Object> requestMap) {
		  try {
	            return billService.getPdf(requestMap);
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return new ResponseEntity<>(new byte[0],HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	@Override
	public ResponseEntity<String> deleteBill(Integer id) {
		  try {
	            return billService.deleteBill(id);
	        } catch (Exception exception){
	            exception.printStackTrace();
	        }
	        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
}
