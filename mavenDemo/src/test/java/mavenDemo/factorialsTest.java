package mavenDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class factorialsTest {

	private factorials demo = new factorials();

	@Test
	public void testWorks() {
		assertEquals("5!", demo.play(120));
	}

	@Test
	public void noReturn() {
		assertEquals("none", demo.play(150));
	}
}
