package ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CharTest {
	@Test
	void emptyStr() {
		String str = "";
		int w = 1;
		assertEquals("", CharToStringApp.wrap(str, w));
	}

	@Test
	void xStrW1() {
		String str = "x";
		int w = 1;
		assertEquals("x", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxStrW1() {
		String str = "xx";
		int w = 1;
		assertEquals("x\nx", CharToStringApp.wrap(str, w));
	}

	@Test
	void xxStrW2() {
		String str = "xx";
		int w = 2;
		assertEquals("xx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxxStrW1() {
		String str = "xxx";
		int w = 1;
		assertEquals("x\nx\nx", CharToStringApp.wrap(str, w));
	}

	@Test
	void xxxStrW2() {
		String str = "xxx";
		int w = 2;
		assertEquals("xx\nx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xspxStrW1() {
		String str = "x x";
		int w = 1;
		assertEquals("x\nx", CharToStringApp.wrap(str, w));
	}
	
	//*/
	@Test
	void xspxStrW2() {
		String str = "x x";
		int w = 2;
		assertEquals("x\nx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xspxStrW3() {
		String str = "x x";
		int w = 3;
		assertEquals("x x", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xspxspxStrW1() {
		String str = "x x x";
		int w = 1;
		assertEquals("x\nx\nx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xspxspxStrW2() {
		String str = "xaxax";
		int w = 2;
		assertEquals("x\nx\nx", CharToStringApp.wrap(str, w));
	}
	

}
