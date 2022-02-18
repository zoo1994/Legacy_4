package com.sj.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BankbookService {
	//Controller-> service -> DAO
	//DAO로 데이터를 보내기전에 전처리작업
	//DAO에서 리턴받은 데이터를 Controller로 보내기 전 후처리 작업
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	// 메서드는 DAO의 메서드와 거의동일
	
	//list
	public List<BankbookDTO> list()throws Exception{
		//DAO메서드 호출 전 전처리작업
		//호출 후 후처리작업
		List<BankbookDTO> ar = bankbookDAO.list();
		
		return ar;
		
	}
	
}
