package com.example.base;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl<T extends BaseModel,K extends BaseDao<T>> implements BaseService<T>{

	@Autowired
	public K baseDao;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return baseDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(T record) {
		return baseDao.insert(record);
	}

	@Override
	public int insertSelective(T record) {
		return baseDao.insertSelective(record);
	}

	@Override
	public T selectByPrimaryKey(Integer id) {
		return baseDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return baseDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(T record) {
		return baseDao.updateByPrimaryKey(record);
	}	

}
