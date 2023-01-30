package com.example.V1.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private JoinsServiceImpl jimpl;
	
	@GetMapping("/left")
	public List<Employee> getleft(){
		return jimpl.leftJoin();
	}
	
	@GetMapping("/right")
	public List<Employee> getright(){
		return jimpl.rightJoin();
	}
}
