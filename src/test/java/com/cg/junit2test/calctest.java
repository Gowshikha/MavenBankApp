package com.cg.junit2test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.junitdemo2.MathCalc;

class calctest {

	@Test
	void test() {
	MathCalc calc= new MathCalc();
	int expected=3;
	assertEquals(expected,calc.add(2, 1));
	}

}
