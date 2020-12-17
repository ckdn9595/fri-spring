package com.fridgeCare.fri.hh;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.fridgeCare.fri.hh.vo.InputVO;

public class DAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	public int idcheck(String id) {
		return sqlSession.selectOne("hsql.idcheck", id);
	}
	public int mailcheck(String mail) {
		return sqlSession.selectOne("hsql.mailcheck", mail);
	}
	public int joinproc(InputVO ivo) {
		return sqlSession.insert("hsql.insertmember", ivo);
	}
	public int logincheck(InputVO ivo) {
		return sqlSession.selectOne("hsql.logincheck", ivo);
	}
	public String getThumb(String sid) {
		return sqlSession.selectOne("hsql.getThumb", sid);
	}
}
