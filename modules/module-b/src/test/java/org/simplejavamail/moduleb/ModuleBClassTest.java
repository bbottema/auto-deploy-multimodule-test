package org.simplejavamail.moduleb;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ModuleBClassTest {
	
	@Test
	public void doesItMoo() {
		assertTrue(new ModuleBClass().doesItMoo());
	}
}