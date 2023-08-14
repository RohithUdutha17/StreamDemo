package com.streamdemo;

import java.util.stream.Stream;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.Builder<String> builder = Stream.builder();
		
		builder.add("Baudrate");
		builder.add("Ohm");
		builder.add("Kilowatt");
		builder.add("Bits");
		builder.add("Analog");
		builder.add("Digital");
		
		Stream stream = builder.build();
		stream.forEach(System.out::println);
		
	}
}
