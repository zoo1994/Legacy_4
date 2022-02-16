package com.sj.s1.dept;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sj.s1.MyJunitTest;

public class DeptDAOTest extends MyJunitTest {
	@Autowired
	private DepartmentDAO deptDAO;
	
	@Test
	public void listTest() throws Exception {
		List<DepartmentDTO> al = deptDAO.list();
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i).getDepartment_name());
		}
		
		assertNotEquals(0, al.size());
	
	}

}
