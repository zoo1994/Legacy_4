package com.sj.s1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BankbookDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.sj.s1.bankbook.BankbookDAO.";
	
	public BankbookDTO detail(Long num)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",num);
	}
	
	public List<BankbookDTO> list() throws Exception{
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	public int add(BankbookDTO bankbookDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"add", bankbookDTO);
	}
	
	public int delete(BankbookDTO bankbookDTO) throws Exception{
		
		return sqlSession.delete(NAMESPACE+"delete",bankbookDTO);
	}
}
