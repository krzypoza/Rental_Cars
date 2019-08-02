package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestRentalApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		int result = binarySearchImpl.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		
		SpringApplication.run(TestRentalApplication.class, args);
	}

}
