package com.hbspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hbspring.model.Employee;
import com.hbspring.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public String addEmployee(@RequestParam("empname") String empname,@RequestParam("age") int age,Model m)
	{	Employee emp=new Employee(empname,age);
		m.addAttribute("emp",emp);
		String msg="fail";
		if(service.saveEmployee(emp))
			msg="success";
		return "view.jsp";
	}
	
	@GetMapping("/employee")
	public String getEmployee(@RequestParam("eid") int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		m.addAttribute("emp",emp);
		return "viewemp.jsp";
		
	}
			
	@GetMapping("/allemployee")
	public String getAllEmployee(Model m)
	{
		List<Employee> emplist=service.getAllEmployee();
		m.addAttribute("emplist",emplist);
		return "viewAll.jsp";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("empId") int empId,Model m)
	{
		String msg="FAiled";
		if(service.deleteEmployee(empId))
		{
			msg="success";
			m.addAttribute("msg",msg);
			return "success.jsp";
		}
		else
		{
			msg="Failure";
			m.addAttribute("msg",msg);
			return "failure.jsp";
		}
			
}
}

