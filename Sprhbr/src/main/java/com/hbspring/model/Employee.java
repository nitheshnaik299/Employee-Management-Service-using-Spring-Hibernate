package com.hbspring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String empname;
	public Employee(String empname, int age) {
		super();
		this.empname = empname;
		this.age = age;
	}
	int age;
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", age=" + age + "]";
	}
	
	
	
}
