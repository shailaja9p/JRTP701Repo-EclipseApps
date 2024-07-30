package com.w3softtech.service;

import java.util.List;

import com.w3softtech.Entity.EmployeeInfo;

public interface IEmployeeMgmtService {
    public  List<EmployeeInfo>  getAllEmployees();
    public  String  addEmployee(EmployeeInfo  emp);
    public   EmployeeInfo  findEmployeeByEno(int eno);
    public   String    updateEmployee(EmployeeInfo emp);
    public   String    deleteEmployee(int no);
}
