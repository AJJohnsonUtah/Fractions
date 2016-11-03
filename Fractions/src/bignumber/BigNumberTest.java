package bignumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigNumberTest {

	@Test
	public void testBigNumberString() {
		BigNumber fromString = new BigNumber("200");
		BigNumber fromLong = new BigNumber(200L);
		BigNumber fromInt = new BigNumber(200);
		
		assertEquals("fromString should equal fromLong.", fromString, fromLong);
		assertEquals("fromLong should equal fromInt.", fromLong, fromInt);
		assertEquals("fromInt should equal fromString.", fromInt, fromString);
	}

	@Test
	public void testBigNumberLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testBigNumberInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testNegate() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		BigNumber b = new BigNumber("-10000000000000000000003982738870823");
		assertEquals("BigNumber toString should return the value of the BigNumber in string format.", "-10000000000000000000003982738870823", b.toString());
	}

	@Test
	public void testEqualsObject() {
		BigNumber a = new BigNumber("-0");
		BigNumber b = new BigNumber(0);
		assertEquals("Negative zero and positive zero should be equal to one another", a, b);
	}

}
