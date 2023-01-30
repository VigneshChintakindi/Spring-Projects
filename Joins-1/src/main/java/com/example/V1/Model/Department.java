package com.example.V1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Dept")
public class Department {
	
	@Id
	private int Dept_id;
	private String Dept_name;
	public int getDept_id() {
		return Dept_id;
	}
	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}
	public String getDept_name() {
		return Dept_name;
	}
	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
}
