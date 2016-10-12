package com.newtouch.dao.impl;

import com.newtouch.dao.UserDao;
import com.newtouch.lion.dao.impl.BaseDaoImpl;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.model.User;

public class UserDaoImpl extends BaseDaoImpl<User, Long> implements UserDao {
	@Override
	public PageResult<User> doFindByCriteria(QueryCriteria queryCriteria) {
		return null;
	}
	
	@Override
	public int doDeleteById(Long id) {
		return 0;
	}
}
