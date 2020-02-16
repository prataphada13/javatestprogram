package com.milkbaket.testProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {

	
	@BeforeClass
	public void beforeClassEvent() {
		System.out.println("This is before class");
	}
	
	
	@BeforeTest
	public void beforeTestEvent() {
		System.out.println("This is before Test");
	}
	
	@AfterTest
	public void afterTestEvent() {
		System.out.println("This is After Test");
	}
	
	@BeforeMethod
	public void beforeMethodEvent() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void afterMethodEvent() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void afterClassEvent() {
		System.out.println("This is after class");
	}
	@Test(priority=1)
	public void firstTestEvent() {
		System.out.println("This is first Test");
	}
	
	@Test(priority=2)
	public void secondTestEvent() {
		System.out.println("This is second Test ");
	}
	
	
	
}
