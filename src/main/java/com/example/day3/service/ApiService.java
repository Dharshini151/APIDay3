package com.example.day3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.model.ApiModel;
import com.example.day3.repository.ApiRepository;

@Service
public class ApiService {
	@Autowired
	ApiRepository ar;
	
	public ApiModel saveinfo(ApiModel am) {
		return ar.save(am);
	}
	
	public List<ApiModel> showinfo(){
		return ar.findAll();
//		public boolean delete
	}
}
