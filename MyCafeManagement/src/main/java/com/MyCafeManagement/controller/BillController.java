package com.MyCafeManagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MyCafeManagement.POJO.Bill;

import java.util.List;
import java.util.Map;

@RequestMapping("/bill")
public interface BillController {
	@PostMapping("/generateReport")
	public ResponseEntity<String> generateReport(@RequestBody Map<String, Object> requestMap);

	@GetMapping(path = "/getBills")
	public ResponseEntity<List<Bill>> getBills();

	@PostMapping("/getPdf")
	public ResponseEntity<byte[]> getPdf(@RequestBody Map<String, Object> requestMap);

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBill(@PathVariable Integer id);
}
