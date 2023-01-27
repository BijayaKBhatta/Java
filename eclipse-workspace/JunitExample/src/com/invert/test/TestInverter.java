package com.invert.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.invert.Inverter;

public class TestInverter {
	@Test  
    public void testInvert(){  
		assertEquals("",Inverter.invert(""));
		assertEquals(null,Inverter.invert(null));
		assertEquals("abc",Inverter.invert("cba"));
		assertEquals("abc",Inverter.invert("cbad"));

    }  

}
