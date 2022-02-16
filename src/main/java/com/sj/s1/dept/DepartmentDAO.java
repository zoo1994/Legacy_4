package com.sj.s1.dept;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sj.s1.dept.DepartmentDAO.";
	
	public List<DepartmentDTO> list() throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
}
