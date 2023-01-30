package com.example.demo.V1.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private ServiceImpl serviceimpl;

	    @GetMapping("/countries/{pageNo}/{pageSize}")
	    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
	            @PathVariable int pageSize) {

	        return serviceimpl.findPaginated(pageNo, pageSize);
	    }

	    @GetMapping("/countries/{pageNo}/{pageSize}/{title}")
	    public List<Country> getPaginatedCountries(@PathVariable int pageNo, 
	            @PathVariable int pageSize,@PathVariable String title) {

	        return serviceimpl.findbyCountry(pageNo, pageSize,title);
	    }

}
