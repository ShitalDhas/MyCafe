package com.MyCafeManagement.dao;

/*import com.kenobi.cafe.pojo.Bill;*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.MyCafeManagement.POJO.Bill;

import java.util.List;

public interface BillDao extends JpaRepository<Bill, Integer> {
	List<Bill> getBills();

	List<Bill> getBillByUsername(@Param("username") String username);
}
