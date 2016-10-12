package com.newtouch.dao;

import com.newtouch.lion.dao.BaseDao;
import com.newtouch.lion.page.PageResult;
import com.newtouch.lion.query.QueryCriteria;
import com.newtouch.model.User;

public interface UserDao extends BaseDao<User, Long> {
	/**
	 * 条件查询
	 * @param queryCriteria
	 * @return
	 */
	public PageResult<User> doFindByCriteria(QueryCriteria queryCriteria);
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	public int doDeleteById(Long id);
}
