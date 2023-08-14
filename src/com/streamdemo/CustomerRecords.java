package com.streamdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CustomerRecords {
	
	ArrayList<Customer> list = new ArrayList<>();
	public CustomerRecords(){
		list.add(new Customer("Rohith","Hyderabad","Prepaid",12,3300));
		list.add(new Customer("Ram","Warangal","Postpaid",6,1500));
		list.add(new Customer("Raju","Karimnagar","Postpaid",12,3300));
		list.add(new Customer("Rajesh","Mumbai","Prepaid",3,700));
		list.add(new Customer("Rahul","Hyderabad","Postpaid",1,200));
	}
	
	public static void main(String args[]) {
		CustomerRecords cr = new CustomerRecords();
		Stream<Customer> stream = cr.list.stream();
		
	//	stream.filter((e)->e.getPlanRange() > 3).forEach(System.out::println);
		
	//	stream.filter(e->e.getAmount()>500).forEach(System.out::println);
		
	//	stream.filter(e->e.getLocation().equals("Mumbai")).map(e->(e.getAmount() + (e.getAmount()*20)/100)).forEach(System.out::println);
		
	//	System.out.println(stream.allMatch(e->e.getAmount() > 300));
		
		System.out.println(stream.anyMatch(e->e.getAmount() > 600));
	}
}
