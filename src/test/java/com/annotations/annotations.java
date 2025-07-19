package com.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	
}
	
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	
	}
	
	
	@Test
	public void test1() {
		System.out.println("afterclass");

}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");


}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");


	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
}}
