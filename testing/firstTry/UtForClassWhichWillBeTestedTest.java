package firstTry;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UtForClassWhichWillBeTestedTest {

	ClassWhichWillBeTested uut;
	
	@Before
	public void setUp() throws Exception {
		uut = new ClassWhichWillBeTested();
	}

	@Test
	public void addTest() {
		assertEquals(5, uut.add(2,3));
	}
	
	@Test
	public void subTest() {
		assertEquals(-1, uut.sub(2,3));
	}

}
