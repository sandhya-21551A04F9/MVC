package com.example.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.mvc;
@Repository
public interface mvcrepositary extends CrudRepository<mvc, Integer>{

}
