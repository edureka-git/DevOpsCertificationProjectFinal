package com.edureka.bankservice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidateLoginTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testValidateLogin() {
		
		assertEquals("Invalid Login", ValidateLogin.logindata(5656,"gghm"));
		
		
		
		//.setText(By.name("username"), "tuser991@yahoo.co.in")
        //.setText(By.name("password"), "abc123")
        //.click(By.xpath("/html/body/div/div/div[2]/div/form/p[3]/input"))

        //.validateTextPresent("You are now logged in");
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() {
		fail("Not yet implemented");
	}

}
