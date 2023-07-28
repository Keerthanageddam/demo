package com.testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("test");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("test");
  }

}
