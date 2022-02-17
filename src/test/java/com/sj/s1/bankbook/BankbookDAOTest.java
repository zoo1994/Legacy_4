package com.sj.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sj.s1.MyJunitTest;

public class BankbookDAOTest extends MyJunitTest {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	@Test
	public void check() {
		assertNotNull(bankbookDAO);
	}
	
	@Test
	public void listTest()throws Exception {
		
		List<BankbookDTO>ar=bankbookDAO.list();
		assertNotEquals(0, ar.size());
	}
	//@Test
	public void addTest()throws Exception{
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookName("t2");
		bankbookDTO.setBookContents("c2");
		bankbookDTO.setBookRate(3.1);
		bankbookDTO.setBookSale(1);
		int result = bankbookDAO.add(bankbookDTO);
		assertEquals(1, result);
	}
	//@Test
	public void detailTest()throws Exception{
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(2L);
		bankbookDTO = bankbookDAO.detail(2L);
		assertNotNull(bankbookDTO);
	}
	
	@Test
	public void deleteTest()throws Exception{
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(2L);
		int result = bankbookDAO.delete(bankbookDTO);
		assertEquals(3, result);
	}
	
	
}
