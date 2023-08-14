package com.streamdemo;

import java.util.Random;
import java.util.stream.IntStream;

public class PrimeNumbers {

	public static boolean isPrime(int n) {
		boolean flag =  true;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream prime = IntStream.range(2, 100);
		prime.filter(e->PrimeNumbers.isPrime(e)).forEach(System.out::println);
	}
}
