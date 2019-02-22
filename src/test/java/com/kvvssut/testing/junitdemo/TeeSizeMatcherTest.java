package com.kvvssut.testing.junitdemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple TeeSizeMatcher.
 */
public class TeeSizeMatcherTest extends TestCase {
	
	private TeeSizeMatcher testClass = new TeeSizeMatcher();
	
	public static Test suite() {
		return new TestSuite(TeeSizeMatcherTest.class);
	}

	public void testMatchTeeSizeS() {
		
		final String size = testClass.getTeeSize(78, 20);
		
		assertEquals("Tee size should be 'S'", "S", size);
	}
}
