package com.example.demo.V1.Model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements CountryService{

    @Autowired
    private CountryRepo repository;

    @Override
    public List<Country> findPaginated(int pageNo, int pageSize) {

    	Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Country> pagedResult = repository.findAll(paging);
        return pagedResult.toList();
    }
    
    @Override
    public List<Country> findbyCountry(int pageNo, int pageSize,String title) {

    	Pageable countryname = PageRequest.of(pageNo, pageSize);
        Page<Country> pagedResult = repository.findbyCountry(title,countryname);
        return pagedResult.toList();
    }

}
