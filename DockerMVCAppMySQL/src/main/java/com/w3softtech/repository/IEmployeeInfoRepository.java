package com.w3softtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.w3softtech.Entity.EmployeeInfo;

public interface IEmployeeInfoRepository  extends JpaRepository<EmployeeInfo, Integer> {

}
