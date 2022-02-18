package com.sj.s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sj.s1.bankbook.BankbookService;

@Controller
@RequestMapping(value="/bankbook/*")
public class BankbookController {
	
	@Autowired
	private BankbookService bankbookServiece;
	
	//list
	@RequestMapping(value="list", method=RequestMethod.GET)
	public void list() throws Exception{
		System.out.println("list Method 실행");
		
	}
}
