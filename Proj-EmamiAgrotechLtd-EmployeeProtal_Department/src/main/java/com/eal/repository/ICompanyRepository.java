package com.eal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eal.model.Company;

public interface ICompanyRepository extends JpaRepository<Company, Integer> {

}
