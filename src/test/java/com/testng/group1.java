package com.testng;

import org.testng.annotations.Test;

public class group1 {
	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = {"sanity","reg"})
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = {"smoke","reg"})
	public void test3() {
		System.out.println("test3");
	}
	@Test(groups = {"smoke","reg"})
	public void test4() {
		System.out.println("test4");
	}


}
