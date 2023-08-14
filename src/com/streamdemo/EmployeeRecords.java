package com.streamdemo;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Ram","Kumar",new Department("Sales","Hyderabad"),new Designation("Manager")));
		list.add(new Employee("Vijay","Kumar",new Department("Accounts","Hyderabad"),new Designation("Trainer")));
		list.add(new Employee("Vikram","Kumar",new Department("Sales","Mumbai"),new Designation("Manager")));
		list.add(new Employee("sohan","Kumar",new Department("Marketing","Chennai"),new Designation("Trainer")));
		
//	List<Employee> empList =	list.stream().filter(e->e.getDepartment().getDepartmentName().equals("Sales") && e.getDesignation().getDesignation_type().equals("Manager")).collect(Collectors.toList());

//	List<Employee> empList = list.stream().filter(e->e.getDepartment().getLocation().equals("Mumbai")).collect(Collectors.toList());
		
	List<String> empList = list.stream().collect(Collectors.mapping((Employee e)-> e.getFirstName()+" "+e.getLastName(),Collectors.toList()));
	System.out.println(empList);
	}

}
