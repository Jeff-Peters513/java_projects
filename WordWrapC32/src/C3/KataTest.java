
package C3;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

public class KataTest {
	
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
		String str = "x x x";
		int w = 2;
		assertEquals("x\nx\nx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xspxspxStrW3() {
		String str = "x x x";
		int w = 3;
		assertEquals("x x\nx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xspxspxStrW4() {
		String str = "x x x";
		int w = 4;
		assertEquals("x x\nx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xspxspxStrW5() {
		String str = "x x x";
		int w = 5;
		assertEquals("x x x", CharToStringApp.wrap(str, w));
	}
	@Test
	void xxspxxStrW1() {
		String str = "xx xx";
		int w = 1;
		assertEquals("x\nx\nx\nx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xxspxxStrW2() {
		String str = "xx xx";
		int w = 2;
		assertEquals("xx\nxx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xxspxxStrW3() {
		String str = "xx xx";
		int w = 3;
		assertEquals("xx\nxx", CharToStringApp.wrap(str, w));
	}
	@Test
	void xxspxxStrW4() {
		String str = "xx xx";
		int w = 4;
		assertEquals("xx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxStrW5() {
		String str = "xx xx";
		int w = 5;
		assertEquals("xx xx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW1() {
		String str = "xx xx xx";
		int w = 1;
		assertEquals("x\nx\nx\nx\nx\nx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW2() {
		String str = "xx xx xx";
		int w = 2;
		assertEquals("xx\nxx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW3() {
		String str = "xx xx xx";
		int w = 3;
		assertEquals("xx\nxx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW4() {
		String str = "xx xx xx";
		int w = 4;
		assertEquals("xx\nxx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW5() {
		String str = "xx xx xx";
		int w = 5;
		assertEquals("xx xx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW6() {
		String str = "xx xx xx";
		int w = 6;
		assertEquals("xx xx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW7() {
		String str = "xx xx xx";
		int w = 7;
		assertEquals("xx xx\nxx", CharToStringApp.wrap(str, w));
	}
	
	@Test
	void xxspxxspxxStrW8() {
		String str = "xx xx xx";
		int w = 8;
		assertEquals("xx xx xx", CharToStringApp.wrap(str, w));
	}
}
