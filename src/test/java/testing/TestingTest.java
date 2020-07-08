package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingTest {

	@Test
	void testdisplay() {
	   Testing testing = new Testing();
	   String expected = "hello";
	   String actual = testing.display("hello");
	   assertEquals(expected,actual);
	
	   
	   
	   
	}

}
