package com.streamdemo;
import java.util.*;
import java.util.stream.Collectors;
public class Customer2Records {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer2> list = new ArrayList<>();
		
		list.add(new Customer2(1,new Product("Coffee",20,5,true,"Rama krishna"),50,"Card","Hyderabad"));
		list.add(new Customer2(2,new Product("Tea",15,4,true,"Vijay"),40,"Cash","Hyderabad"));
		list.add(new Customer2(3,new Product("Espresso",30,2,false,"Rama krishna"),30,"Card","Mumbai"));
		list.add(new Customer2(4,new Product("Milk",20,6,true,"Ramesh"),120,"Cash","Chennai"));
		list.add(new Customer2(5,new Product("Latte",25,7,true,"Vijetha"),150,"Card","Hyderabad"));
		list.add(new Customer2(6,new Product("Tea",15,4,true,"Vijay"),100,"Card","Mumbai"));
		
		Map<String,List<Customer2>> customerListBasedOnLocation = list.stream().collect(Collectors.groupingBy(Customer2::getLocation));

		for(String s:customerListBasedOnLocation.keySet()) {
			System.out.println(s);
			List<Customer2> customer= customerListBasedOnLocation.get(s);
			System.out.println(customer);
		}
		
		Map<Product,List<Customer2>> customerListBasedOnProduct = list.stream().collect(Collectors.groupingBy(Customer2::getProduct));
		
		for(Product p:customerListBasedOnProduct.keySet()) {
			System.out.println(p);
			List<Customer2> list1 = customerListBasedOnProduct.get(p);
			System.out.println(list1);
		}
		
		Map<String,Double> customerListBasedOnCardType = list.stream().collect(Collectors.groupingBy(Customer2::getPayment_type,Collectors.averagingDouble(Customer2::getAmount_paid)));
		
		for(String s:customerListBasedOnCardType.keySet()) {
			System.out.println(s);
			Double amount= customerListBasedOnCardType.get(s);
			System.out.println(amount);
		}
		
		Map<String,Double> customerListBasedOnStoreName = list.stream().collect(Collectors.groupingBy(e->e.getProduct().getStore_name(),Collectors.averagingDouble((e->e.getProduct().getPrice()))));
		for(String s:customerListBasedOnStoreName.keySet()) {
			System.out.println(s);
			Double avgPrice= customerListBasedOnStoreName.get(s);
			System.out.println(avgPrice);
		}
		
		Map<String,DoubleSummaryStatistics> summary = list.stream().collect(Collectors.groupingBy(Customer2::getLocation,Collectors.summarizingDouble(Customer2::getAmount_paid)));
		for(String s:summary.keySet()) {
			System.out.println(s);
			DoubleSummaryStatistics avgPrice= summary.get(s);
			System.out.println(avgPrice);
		}
		
	}
		
}
