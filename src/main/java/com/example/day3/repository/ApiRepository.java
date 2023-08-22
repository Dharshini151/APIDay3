package com.example.day3.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day3.model.ApiModel;
public interface ApiRepository extends JpaRepository<ApiModel,Integer>{

}