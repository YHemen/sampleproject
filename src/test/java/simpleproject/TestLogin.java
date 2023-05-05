package simpleproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLogin {

	@Test
	public void testusertrue() {
		LoginAuthentication auth = new LoginAuthentication();
		assertEquals(true,auth.validateuser("admin", "admin123"));
		
	}
	@Test
	public void testuserfalse() {
		LoginAuthentication auth = new LoginAuthentication();
		assertEquals(false,auth.validateuser("admins", "addmin123"));
		
	}
}
