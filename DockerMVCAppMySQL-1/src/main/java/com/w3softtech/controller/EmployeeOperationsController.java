package com.w3softtech.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.w3softtech.entity.EmployeeInfo;
import com.w3softtech.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeService  empService;
	
	
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}
	
	
	@GetMapping("/report")
	public  String   showReportData(Map<String,Object> map) {
		//use service
		List<EmployeeInfo> list=empService.getAllEmployees();
		//add results in Model attributes
		map.put("resultList", list);
		//return LVN
		return "show_report";
		
	}
	
	@GetMapping("/add")
	public  String  ShowAddEmployeeFormPage(@ModelAttribute("emp") EmployeeInfo emp) {
		//return  LVN
		return "employee_register";
	}
	
	/*	@PostMapping("/add")
		public   String    registerEmployee(@ModelAttribute("emp") EmployeeInfo  emp,
				                                                       Map<String,Object>  map) {
			//use  Service
			String result=empService.addEmployee(emp);
			List<EmployeeInfo> list=empService.getAllEmployees();
			//  add the result to Model attribute
			map.put("resultMsg", result);
			map.put("resultList", list);
			// return LVN
			return  "show_report";
			
		}*/
	
	/*@PostMapping("/add")
	public   String    registerEmployee(@ModelAttribute("emp") EmployeeInfo  emp,
			                                                       Map<String,Object>  map) {
		//use  Service
		String result=empService.addEmployee(emp);
		//  add the result to Model attribute
		map.put("resultMsg", result);
		// return LVN
		return  "redirect:report";
		
	}*/
	
	/*@PostMapping("/add")
	public   String    registerEmployee(@ModelAttribute("emp") EmployeeInfo  emp,
			                                                      RedirectAttributes  rAttrs) {
		//use  Service
		String result=empService.addEmployee(emp);
		//  add the result to Model attribute
		 rAttrs.addFlashAttribute("resultMsg", result);
		// return LVN
		return  "redirect:report";
		
	}*/
	
	@PostMapping("/add")
	public   String    registerEmployee(@ModelAttribute("emp") EmployeeInfo  emp,
			                                                     HttpSession ses) {
		//use  Service
		String result=empService.addEmployee(emp);
		//  add the result to Model attribute
		 ses.setAttribute("resultMsg", result);
		// return LVN
		return  "redirect:report";
		
	}
	
	@GetMapping("/edit")
	public  String  showEditPage(@RequestParam("no") int eno,@ModelAttribute("emp") EmployeeInfo info) 
	{
		//use service
		  EmployeeInfo info1=empService.findEmployeeByEno(eno);
		  //copy data
		   BeanUtils.copyProperties(info1, info);
		  //return  edit employee form page lauch
		  return "employee_edit";
	}
	
	@PostMapping("/edit")
	public   String   processEditFormSubmission(@ModelAttribute("emp") EmployeeInfo info,
			                                                                    RedirectAttributes attrs) {
		 //use service
		 String resultMsg=empService.updateEmployee(info);
		 //keep results in model attributes
		 attrs.addFlashAttribute("resultMsg", resultMsg);
		 //return LVN
		 return "redirect:report";
	}
	
	@GetMapping("/delete")
	public  String   deleteEmployee(@RequestParam("no") int eno,
		                                                          	RedirectAttributes attrs  ) {
		//use service
		String resultMsg=empService.deleteEmployee(eno);
		 //keep results in model attributes
		 attrs.addFlashAttribute("resultMsg", resultMsg);
		 //return LVN
		 return "redirect:report";
	}

}
