package com.example.demo.V1.Model;


import java.util.List;

public interface CountryService {

List<Country> findPaginated(int pageNo, int pageSize);List<Country> findbyCountry(int pageNo, int pageSize, String title);;
}
