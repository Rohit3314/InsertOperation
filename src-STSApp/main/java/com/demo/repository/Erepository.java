package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Employee;

public interface Erepository extends JpaRepository<Employee,Integer>
{

}
