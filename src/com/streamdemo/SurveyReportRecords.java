package com.streamdemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class SurveyReportRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SurveyReport> list = new ArrayList<>();
		
		list.add(new SurveyReport(1,"Ram","Hyderabad",100,10,80));
		list.add(new SurveyReport(2,"Rahul","Warangal",50,5,40));
		list.add(new SurveyReport(3,"Rajesh","Mumbai",200,15,150));
		list.add(new SurveyReport(4,"Ramesh","Chennai",70,8,70));
		list.add(new SurveyReport(5,"Rakesh","Delhi",150,10,120));
		
		Stream<SurveyReport> stream = list.stream();
		
//1		SurveyReport maxRequest = stream.max((e1,e2)->{
//			if(e1.getTotal_connection_request() == e2.getTotal_connection_request()) {
//				return 0;
//			}else if(e1.getTotal_connection_request() > e2.getTotal_connection_request()) {
//				return 1;
//			}
//			else {
//				return -1;
//			}
//		}).get();
//		
//		System.out.println(maxRequest);
		
//2		int i = stream.map(e->e.getNo_of_days_for_request_completion()).reduce(0,(e1,e2)->e1+e2);
//		System.out.println(i/list.size());
		
//3		int i = stream.map(e->e.getAverage_request_per_day()).reduce(0,(e1,e2)->e1+e2);
//		System.out.println(i); 
		
		System.out.println(stream.filter(e->e.getLocation().equals("Delhi")).count());
	}

}
