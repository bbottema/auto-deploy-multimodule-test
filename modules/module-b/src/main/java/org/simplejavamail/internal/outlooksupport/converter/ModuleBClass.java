package org.simplejavamail.internal.outlooksupport.converter;

import org.simplejavamail.internal.dkimsupport.ModuleAClass;

public class ModuleBClass {
	
	public static void main(String[] args) {
		System.out.println("Does it moo: " + new ModuleBClass().doesItMoo());
	}
	
	public boolean doesItMoo() {
		return new ModuleAClass().doesItMoo();
	}
}
