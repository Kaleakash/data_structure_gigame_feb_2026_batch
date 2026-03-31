package com.tree.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	String name;
	String role;
	List<Employee> subordinates;
	public Employee(String name, String role) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.role=role;
		this.subordinates= new ArrayList<Employee>();
	}
	public void add(Employee emp) {
		this.subordinates.add(emp);
	}
	public void display(int level) {
//		Iterator<Employee> li = subordinates.iterator();
//		while(li.hasNext()) {
//			Employee emp = li.next();
//			System.out.println(emp.name+" "+emp.role);
//		}
		for(int i=0;i<level;i++) {
				//System.out.println(i);
				Employee emp = subordinates.get(i);
				System.out.println(emp.name+" "+emp.role);
		}
	}
}

public class TreeOrganizationExamples {

	public static void main(String[] args) {
		Employee ceo = new Employee("Ajay", "CEO");
		Employee manager1 = new Employee("Raj", "Manager");
		Employee manager2 = new Employee("Vikash", "Manager");
		Employee developer1 = new Employee("Mahesh", "Developer");
		Employee developer2 = new Employee("Reeta", "Developer");
		Employee tester1 = new Employee("Vijay", "Tester");
		Employee tester2 = new Employee("Ram", "Tester");
		Employee hr = new Employee("Dev", "HR");
		Employee clear = new Employee("Raju", "Clear");
		ceo.add(manager1);
		ceo.add(manager2);
		
		manager1.add(developer1);
		manager2.add(developer2);
		manager1.add(tester1);
		manager1.add(tester2);
		
		ceo.add(hr);
		
		hr.add(clear);
		
		ceo.display(3);
	}

}
