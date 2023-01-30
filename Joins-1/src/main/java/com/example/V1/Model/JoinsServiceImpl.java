package com.example.V1.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinsServiceImpl implements JoinsService{
	
	@Autowired
	private EmpRepo erepo;
	
	@Override
	public List<Employee> leftJoin(){
		return erepo.LeftJoin();
	}
	
	@Override
	public List<Employee> rightJoin(){
		return erepo.RightJoin();
	}
	
}
