package main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator_Test {
	
	Calculator obj = new Calculator();
	@BeforeAll
	public void beforeall() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void beforejunit() {
		System.out.println("Before junit");
	}
	@Test
	public void addTest() {
		int result = obj.add(2,3);
	}	
	@Test
	public void subTest() {
		obj.substraction();
		
	}
	
	@Test
	public void mulTest() {
		obj.multiplication();
	}
	@AfterEach
	public void afterjunit() {
		System.out.println("After junit");
		
	}
	@AfterAll
	public void afterall() {
		System.out.println("After all");
		
	}

}
