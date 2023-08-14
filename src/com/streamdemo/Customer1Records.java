package com.streamdemo;

import java.util.*;
import java.util.stream.Collectors;

public class Customer1Records {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer1> list = new ArrayList<>();
		list.add(new Customer1("Ram","kumar","ram1232@gami.com",new Location("Hyderabad","Telangana")));
		list.add(new Customer1("Rahul","kumar","rahul1232@gami.com",new Location("Chittor","AP")));
		list.add(new Customer1("Rajesh","kumar","rajes1232@gami.com",new Location("Mysore","Karnataka")));
		list.add(new Customer1("Ravi","kumar","ravi1232@gami.com",new Location("Marine drive","Mumbai")));
		
	    List<String> customerList  =	list.stream().map((e)->"Name : "+e.getFirstName()+" "+e.getLastName()+","+e.getLocation()).collect(Collectors.toList());
	    System.out.println(customerList);
	}

}
