package com.glzhu.mavendemo;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testMethod(){
		HelloWorld hw = new HelloWorld();
			int ss= hw.add(1, 1);
			Assert.assertEquals(ss, 2);
	}
	
	
}
