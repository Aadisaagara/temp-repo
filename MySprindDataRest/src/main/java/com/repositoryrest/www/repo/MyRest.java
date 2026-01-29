package com.repositoryrest.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.repositoryrest.www.entity.Employees;

@RepositoryRestController(path = "emps")
public interface MyRest extends JpaRepository<Employees, Integer> {

}
