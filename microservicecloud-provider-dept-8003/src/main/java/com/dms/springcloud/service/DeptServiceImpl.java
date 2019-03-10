package com.dms.springcloud.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dms.springcloud.dao.DeptDao;
import com.dms.springcloud.entities.Dept;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Resource
	private DeptDao dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
