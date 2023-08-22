package com.example.day3.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day3.model.ApiModel;
import com.example.day3.repository.ApiRepository;
import com.example.day3.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService aser;
	@Autowired
	ApiRepository apirepo;
	
	@PostMapping("/addEmp")
	public ApiModel add(@RequestBody ApiModel am) {
		return aser.saveinfo(am);
	}
	
	@GetMapping("/showemp")
	public List<ApiModel> show(){
		return aser.showinfo();
		}
   @PostMapping("/multiple")
   public ResponseEntity<String> saveMultiple(@RequestBody List<ApiModel> am){
	   apirepo.saveAllAndFlush(am);
	   return ResponseEntity.ok("saved multiple data");
   }

   
}
