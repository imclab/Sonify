/*******************************************************************************
 * Copyright (c) 2012 BragiSoft, Inc.
 * This source is subject to the BragiSoft Permissive License.
 * Please see the License.txt file for more information.
 * All other rights reserved.
 * 
 * THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY 
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
 * PARTICULAR PURPOSE.
 * 
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * Contributors:
 * Jan-Christoph Klie - Everything
 * 
 *******************************************************************************/

package com.bragi.sonify;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.bragi.sonify.composer.lsystem.LSystem;

/**
 * I test ma stuff here!
 * 
 */
public class App {
	
	public static void main(String[] args) {
		Set<Character> vars = new HashSet<Character>();
		Map<String, String> rulez = new HashMap<String, String>();
		final String AXIOM = "a";
		
		vars.add('a');
		vars.add('b');
		
		rulez.put("a", "b");
		rulez.put("b", "(a)[b]");
		
		LSystem l = new LSystem( vars, AXIOM, rulez);
		
		System.out.println(l);
		
		System.out.println(l.generate(3));
		
	}
}