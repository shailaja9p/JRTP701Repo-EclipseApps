package com.lifetree.sb;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lifetree.service.IEmployeeService;

@Controller
@RequestMapping("/employeeApi")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/showRecords")
	public String showAllRecords(Map<String, String> map,@RequestParam int eno) {
		
		String eName=service.getEmployeeName(eno);
		map.put("empName", eName);
		return "welcome";
	}
}
