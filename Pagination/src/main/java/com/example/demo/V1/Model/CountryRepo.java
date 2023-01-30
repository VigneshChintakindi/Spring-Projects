package com.example.demo.V1.Model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends PagingAndSortingRepository<Country, Long> {

	@Query("SELECT c from Country c where c.name=:countryname")
	 public Page<Country> findbyCountry(String countryname, Pageable p);
}
