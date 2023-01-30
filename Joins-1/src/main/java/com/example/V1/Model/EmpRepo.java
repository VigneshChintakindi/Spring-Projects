package com.example.V1.Model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	@Query(value="select e ,d from Employee e left join Department d on e.department=d.Dept_id")
	public List<Employee> LeftJoin();
	
	@Query(value="select e ,d from Employee e right join Department d on e.department=d.Dept_id")
	public List<Employee> RightJoin();
}
