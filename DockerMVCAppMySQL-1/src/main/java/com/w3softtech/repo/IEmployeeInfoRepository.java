package com.w3softtech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w3softtech.entity.EmployeeInfo;

public interface IEmployeeInfoRepository  extends JpaRepository<EmployeeInfo, Integer> {

}