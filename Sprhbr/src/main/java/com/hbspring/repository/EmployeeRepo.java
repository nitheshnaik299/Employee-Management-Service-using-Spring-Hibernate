package com.hbspring.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hbspring.model.Employee;



@Repository
public class EmployeeRepo {
	@Autowired
	SessionFactory sf;
	
	@Transactional
	public boolean saveEmployee(Employee emp)
	{
		Session ssn=sf.openSession();
		ssn.save(emp);
        //Transaction tx=sf.
		
		return true;
		
	}
	
	@Transactional
	public Employee getEmployee(int empId)
	{
		Session ssn=sf.openSession();
		return ssn.get(Employee.class,empId);
		
	}
	
	@Transactional
	public List<Employee> getAllEmployee()
	{
		Session ssn=sf.openSession();
		Criteria ctr=ssn.createCriteria(Employee.class);
		return(ctr.list());
		
	}
	
	@Transactional
	public boolean deleteEmployee(int empId)
	{
		Session ssn=sf.openSession();
		ssn.delete(empId);
		return true;
	}

}
