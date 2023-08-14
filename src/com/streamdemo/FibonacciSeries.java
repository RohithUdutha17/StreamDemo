package com.streamdemo;

import java.util.stream.IntStream;

public class FibonacciSeries {
	private int d = 1;
	public int getNextValue(int n) {
		int temp = d;
		d = n+d;
		n = temp;
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fs = new FibonacciSeries();
		IntStream fibonacci = IntStream.iterate(0,(n)->fs.getNextValue(n+1) ).limit(10);
		fibonacci.forEach(System.out::println);
	}

}
