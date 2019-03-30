package org.simplejavamail.modulea;

import static org.junit.Assert.assertTrue;

public class ModuleAClassTest {
	
	@org.junit.Test
	public void doesItMoo() {
		assertTrue(new ModuleAClass().doesItMoo());
	}
}